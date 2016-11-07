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
public class Snake {
    
    /*
    Inirow will be the initial row of the snake's head and inicol will be the 
    column where the snake's head is positioned.
    */
    int poison;
    
    public Snake(int poison){
        this.poison = poison;
    }
    
    
    @Override
    public String toString(){
        return "S";
    }
}
