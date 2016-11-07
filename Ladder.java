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
public class Ladder {
    
    /*
    inirow and inicol are the starting postions of the ladder or the position
    of the base of the ladder.
    */
    int climb;
    
    public Ladder(int climb){
        this.climb = climb;
        
    }

    
    @Override
    public String toString(){
        return "L";
    } 
}
