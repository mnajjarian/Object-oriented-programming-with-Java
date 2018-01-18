/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mehdi
 */
public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
        
//To change body of generated methods, choose Tools | Templates.
    }

    public void printProduct() {
        System.out.println(this.name + ", Price " + price + ", Amount " + amount);
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
