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
public abstract class Piece {
    
    String colour;
    
    abstract void move(int inirow, int inicol, int firow, int ficol);
        
    
    
}
