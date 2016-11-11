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
public class Board {
    
    
    public static Object board[][] = new Object[6][101];
 
    public static int chance = 4;
    /* for mod(4)== 0 red will play, for 1 green will play, for 2 blue will play and for 3 yellow will play*/
    
    public Board(){
        
        Player p1 = new Player("First", "Red");
        Player p2 = new Player("Second", "Green");
        Player p3 = new Player("Third", "Blue");
        Player p4 = new Player("Fourth", "Yellow");
        
        
        
        Snake s1 = new Snake(93);
        Snake s2 = new Snake(21);
        Snake s3 = new Snake(42);
        Snake s4 = new Snake(42);
        Snake s5 = new Snake(23);
        
        
        Ladder l1 = new Ladder(39);
        Ladder l2 = new Ladder(82);
        Ladder l3 = new Ladder(21);
        Ladder l4 = new Ladder(23);
        
        Board.board[0][99] = s1;
        Board.board[0][88] = s2;
        Board.board[0][71] = s3;
        Board.board[0][55] = s4;
        Board.board[0][24] = s5;
        
        Board.board[0][42] = l1;
        Board.board[0][15] = l2;
        Board.board[0][66] = l3;
        Board.board[0][8] = l4;
        
        
        
      
        
        
       
    }
}
