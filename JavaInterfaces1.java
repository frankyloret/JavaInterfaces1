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
public class JavaInterfaces1 {
    static Shoe hightop;
    public static void init(){
        hightop = new Shoe();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        init();
        getInfo(hightop);
        orderInfo(hightop);
    }
    
    public static void getInfo(Shoe item){
        System.out.println("This product is made by " + item.MAKER);
        System.out.println("It costs $" + item.getPrice(1) + '\n');
    }
    
    public static void orderInfo(Product item){
        System.out.println("To order from " + item.MAKER + " call " + item.PHONE + ". ");
        System.out.println("Each item costs $" + item.getPrice(1));
    }
    
}
