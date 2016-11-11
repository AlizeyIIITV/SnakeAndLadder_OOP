/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeAndLadder;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author Alizey
 */
public class Driver {
    
    public static void main(String arg[]){
        
        Board b = new Board();
        int i, j;
        Scanner sc = new Scanner(System.in);
        
        Red R = new Red("Red");
        Green G = new Green("Green");
        Blue B = new Blue("Blue");
        Yellow Y = new Yellow("Yellow");
        
        Snake s = new Snake(0);
        Ladder l = new Ladder(0);
        
        int loc = 0;
        // generating a random number between 1 and 6.
        // upper limit is usually exclusive of range, so to make it inclusive. we add one to it.
        
        int dice;
        
        Piece p = null;
        
        boolean end = false;
        
        System.out.println("Welcome to the classic Snake&Ladder game!");
        System.out.println("The game will work as follows:- \nThe Red piece will run first and then the moves of Blue, Green and Yellow will follow respectively!");
        
        while(end == false){
            System.out.println("");
        
            for(i = 0; i <= 5; i++ ){
                for(j = 0; j <= 100; j++){
                
                    if(Board.board[i][j] != null)
                        System.out.print(Board.board[i][j] + " ");
                    
                    else if(i == 0 && Board.board[i][j] == null)
                        System.out.print(j + " ");
                    
                    else if(i == 5 && Board.board[0][j] != null){
                        if(Board.board[0][j].getClass() == s.getClass()){
                            s = (Snake) Board.board[0][j];
                            int k = j - s.poison;
                            System.out.print(k+ " ");
                        }
                        else if(Board.board[0][j].getClass() == l.getClass()){
                            l = (Ladder) Board.board[0][j];
                            int t = j + l.climb;
                            System.out.print(t+" ");
                            
                        }
                    }
                    
                    
                    else if(j < 10)
                        System.out.print("-"+" ");
                    
                    else if(j > 9 && Board.board[0][j] != null)
                        System.out.print("-"+ " ");
                    
                    else
                        System.out.print("--"+ " ");
                }
                
                System.out.println("");
            }
        
            System.out.println("");
        
            if(Board.chance%4 == 0){
                System.out.println("Red's chance!");
            
                System.out.println("Press ENTER to roll the dice! :)");
            
                for(i = 0; i < 101; i++){
                    if(Board.board[1][i] == null){
                        continue;
                    }
                    if(Board.board[1][i].getClass() == R.getClass()){
                        loc = i;
                        break;
                    }
                }
            
                sc.nextLine();
            
                dice = ThreadLocalRandom.current().nextInt(1, 7);
            
                System.out.println("The dice roll got us: " + dice);
            
                p = (Piece) Board.board[1][loc];
                p.move(1, loc, 1, loc+dice);
            
                if(dice == 6){
                    Board.chance--;
                }
            }
        
            else if(Board.chance%4 == 1){
                System.out.println("Green's chance!");
            
                System.out.println("Press ENTER to roll the dice! :)");
            
                for(i = 0; i < 101; i++){
                    if(Board.board[2][i] == null){
                    continue;
                    }
                    if(Board.board[2][i].getClass() == G.getClass()){
                        loc = i;
                        break;
                    }
                }
            
                sc.nextLine();
            
                dice = ThreadLocalRandom.current().nextInt(1, 7);
            
                System.out.println("The dice roll got us: " + dice);
            
                p = (Piece) Board.board[2][loc];
                p.move(2, loc, 2, loc+dice);
            
                if(dice == 6){
                    Board.chance--;
                }
            }
        
            else if(Board.chance%4 == 2){
                System.out.println("Blue's chance!");
            
                System.out.println("Press ENTER to roll the dice! :)");
            
                for(i = 0; i < 101; i++){
                    if(Board.board[3][i] == null){
                        continue;
                    }
                    if(Board.board[3][i].getClass() == B.getClass()){
                        loc = i;
                        break;
                    }
                }
                
                sc.nextLine();
            
                dice = ThreadLocalRandom.current().nextInt(1, 7);
            
                System.out.println("The dice roll got us: " + dice);
            
                p = (Piece) Board.board[3][loc];
                p.move(3, loc, 3, loc+dice);
            
                if(dice == 6){
                    Board.chance--;
                }
            }
        
            else if(Board.chance%4 == 3){
                System.out.println("Yellow's chance!");
            
                System.out.println("Press ENTER to roll the dice! :)");
            
                for(i = 0; i < 101; i++){
                    if(Board.board[4][i] == null){
                        continue;
                    }
                    if(Board.board[4][i].getClass() == Y.getClass()){
                        loc = i;
                        break;
                    }
                }
            
                sc.nextLine();
            
                dice = ThreadLocalRandom.current().nextInt(1, 7);
            
                System.out.println("The dice roll got us: " + dice);
            
                p = (Piece) Board.board[4][loc];
                p.move(4, loc, 4, loc+dice);
            
                if(dice == 6){
                    Board.chance--;
                }
            }
        
            for(j = 1; j <= 4; j++){
                if(Board.board[j][100] == null)
                    continue;
            
                if(Board.board[j][100] != null){
                    p = (Piece) Board.board[j][100];
                    end = true;
                    break;
                }
                
            }
        
            if(end == true){
                System.out.println("Congratulations, the winner is: "+ p.colour);
            
                for(i = 0; i <= 4; i++ ){
                    for(j = 0; j <= 100; j++){
                
                        if(Board.board[i][j] != null)
                            System.out.print(Board.board[i][j] + " ");
                    
                        else if(i == 0 && Board.board[i][j] == null)
                            System.out.print(j + " ");
                    
                        else if(j < 10)
                            System.out.print("-"+" ");
                    
                        else if(j > 9 && Board.board[0][j] != null)
                            System.out.print("-"+ " ");
                    
                        else
                            System.out.print("--"+ " ");
                    }
                    System.out.println("");
                }
        
                System.out.println("");
        
            
            }
        }
    }
    
}
