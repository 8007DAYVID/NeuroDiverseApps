/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frograce;
import java.util.Scanner;

/**
 *
 * @author KevinKeith
 */
public class FrogRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int menuItem = 0;
        Scanner sc = new Scanner(System.in);
        
        while( menuItem != 3)
        {
            printMenu();
            menuItem = sc.nextInt();
            
            if( menuItem == 1)
            {
                
            }
            else if( menuItem == 2)
            {
                
            }
            else if( menuItem == 3)
            {
                System.out.println("Exiting.....");
            }
            else
            {
                System.out.println("Warning:  Not a valid menu option!");
            }
        }
        
    }
    
    public static void printMenu()
    {
        System.out.println("1.  Three Frog Race");
        System.out.println("2.  Array Frog Race");
        System.out.println("3.  Exit");
        System.out.print("Enter your selection >> ");
    }
    
    public static void threeFrogRace()
    {
        System.out.println("In the three frog race method ");   //delete this line once you have implemented the logic for this method
        //TO DO - your code will go here
    }
    
    public static void arrayFrogRace()
    {
        System.out.println("In the three array frog race method ");   //delete this line once you have implemented the logic for this method
        //TO DO - your code will go here
    }
        
}
