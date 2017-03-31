/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterfaces1;

/**
 *
 * @author VIVES
 */
public class Shoe implements Product{
    public int getPrice(int id){
        if(id == 1)
            return(5);
        else
            return(10);
    }
    public String getMaker(){
        return(MAKER);
    }
    
}
