/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeAndLadder;

/**
 *
 * @author Alizey
 */
public class Green extends Piece {
    
    public Green(String colour){
        this.colour = colour;
    }
    
    @Override
    void move(int inirow, int inicol, int firow, int ficol){
        
        boolean check = true;
        
        if(inirow == firow && inirow == 2 && ficol-inicol <= 6 && ficol-inicol > 0){
            
            if(ficol > 100){
                System.out.println("You should be getting less, best of luck next time xD");
                Board.chance++;
                check = false;
            }
            
            if(check == true){
                if(Board.chance%4 == 1){ 
                 
                    Snake s = new Snake(0);
                    Ladder l = new Ladder(0);
         
                    Board.board[firow][ficol] = Board.board[inirow][inicol];
                    Board.board[inirow][inicol] = null;
                
                    if(Board.board[0][ficol] != null){
                
                        if(Board.board[0][ficol].getClass() == s.getClass()){
                            Snake s1 = (Snake)Board.board[0][ficol];
                            int bite = s1.poison;
                            int change = ficol - bite;
                            Board.board[firow][change] = Board.board[firow][ficol];
                            Board.board[firow][ficol] = null;
                        }
                        else if(Board.board[0][ficol].getClass() == l.getClass()){
                            Ladder l1 = (Ladder)Board.board[0][ficol];
                            int climb = l1.climb;
                            int change = ficol + climb;
                            Board.board[firow][change] = Board.board[firow][ficol];
                            Board.board[firow][ficol] = null;
                        }
                    }
                }
            }
            
        }
        else
            check = false;
        
        if(check == true){
            Board.chance++;
            
        }
        
        else
            System.out.println("Invalid chance/move!");
    }
    
    @Override
    public String toString(){
        return "G";
    }
}
