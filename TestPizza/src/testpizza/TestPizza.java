/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpizza;
import java.util.Scanner;

/**
 *
 * @author Stem TV
 */
public class TestPizza
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Pizza myPizza = new Pizza();  //create a pizza object
        String crust = "Stuffed";
        int toppings = 3;
        char size = 'S';
        
        myPizza.setCrustType(crust);
        myPizza.setNumberOfToppings(toppings);
        myPizza.setSize(size);
        
        System.out.printf("You ordered a %c %s pizza with %d toppings %n", myPizza.getSize(), myPizza.getCrustType(), myPizza.getNumberOfToppings());
        System.out.printf("Your total is $%.2f%n", myPizza.getPrice());
    } //end-of-main
    
}//end-of-class
