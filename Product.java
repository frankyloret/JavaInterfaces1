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
public interface Product {
    static final String MAKER = "My Corp";
    static final String PHONE = "555-123-4567";
    
    public int getPrice(int id);
}
