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
public class Player {
    String name;
    String colour;
    
    
    public Player(String name, String colour){
        this.name = name;
        this.colour = colour;
        
        if(colour.equalsIgnoreCase("Red")){
            Piece red = new Red("Red");
            Board.board[1][0] = red;
            
        }
        else if(colour.equalsIgnoreCase("Green")){
            Piece green = new Green("Green");
            Board.board[2][0] = green;

        }
        else if(colour.equalsIgnoreCase("Blue")){
            Piece blue = new Blue("Blue");
            Board.board[3][0] = blue;

        }
        else if(colour.equalsIgnoreCase("Yellow")){
            Piece yellow = new Yellow("Yellow");
            Board.board[4][0] = yellow;

        }
        
        
        
        
        
    }
}
