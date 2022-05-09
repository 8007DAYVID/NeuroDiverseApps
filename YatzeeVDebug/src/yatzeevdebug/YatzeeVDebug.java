package yatzeevdebug;

import java.util.Random;
import java.util.Scanner;

public class YatzeeVDebug
{

    public static void main(String[] args) 
    {
        int[] dice = new int[5]; // number of fair dice
        boolean[] rollDice = {true, true, true, true, true};
        int rollNumber = 0;      // initialized counter to zero
        
        //      Roll and print the dice
        //          Call the rollDice method
        //          Call the print Dice method
        
        rollNumber++;  //rollNumber = (0 + 1)
        System.out.printf("Roll #%d%n", rollNumber);  //print Roll #1 {line-feed}
        
        // System.out.print("Dice Values: ");
      
        for(int aDice : dice)
        {
            System.out.print( dice + " ");
        }
        System.out.println();
        
        
        rollDice(dice, rollDice); // sending five dice and rollDice array {true, true, true, true, true}
        printDice( dice);
     
    } // end-main
    

    public static void printDice( int[] dice)
    {
        System.out.print("Dice Values: ");
      
        for(int aDice : dice )
        {
            System.out.print( dice + " ");
        }
        System.out.println();
        

    }
    
    public static void rollDice( int[] dice, boolean[] roll)
    {
        //you should only roll the dice where the
        //parallel array value in roll is true.
        //For example:  
        //  dice = {    3,    2,    1,     3,    4 };
        //  roll = {false, true, true, false, true };
        //  This code should only re-roll the dice with the values 2, 1, and 4.
        //  It should keep the 3's.
        //
        //  Dice have a value of 1 to 6
        
        Random rand = new Random();
        for(int i = 0; i < dice.length; i++)
        {
            dice[i] = rand.nextInt(6);

        }
        

    } // end rollDice
    
    
}

// David, try to answer these questions:
//  why arnt there any returns?
//  why are dice dice.length being reused in rollDice( ),
//     after already being first used in main()?
//        I'm not saying that it cannot be done; but, I'm 
//           guessing it could be avoided?
//  what is the intended purpose for the variable aDice?
