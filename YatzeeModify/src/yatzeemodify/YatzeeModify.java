// DavidSchmidt
// Thu.12:49pm032322a
// STEM BUILD, Basement #014
// Skipping Debug-L13

package yatzeemodify;

import java.util.Random;
import java.util.Scanner;

public class YatzeeModify
{

   public static void main(String[] args) 
    {
        int[] dice = new int[5];
        boolean[] rollDice = {true, true, true, true, true};
        int rollNumber =0;
        
        //      Roll and print the dice
        //          Call the rollDice method
        //          Call the print Dice method
        rollNumber++;
        System.out.printf("Roll #%d%n", rollNumber);
        rollDice(dice, rollDice);
        printDice( dice);
        
        // TO DO: for MODIFY
        //
        //      The code that you need to add consists of calling the current methods
        //      that have been written.  You only need to add code here to main()
        //
        //      Next ask the user with dice to keep, roll the dice that should be rolled and print the dice
        //          call the diceToKeep method and store the return value in boolean array
        //          Call the rollDice method
        //          Call the print Dice method
        //
        //      The user gets three rolls.  The initial roll and two more rolls after selecting the values.
        //      You can either to this in a loop, or do is sequentially.
       
        
    }
    

    public static void printDice( int[] dice)
    {
        System.out.print("Dice Values: ");
      
        for(int aDice : dice )
        {
            System.out.print( aDice + " ");
        }
        System.out.println();
        
        
    }
    
    public static void rollDice( int[] dice, boolean[] roll)
    {
        Random rand = new Random();
        for(int i = 0; i < dice.length; i++)
        {
            if( roll[i] )
            {
                dice[i] = rand.nextInt(6) + 1;
            }
        }
    }
    
    public static boolean[] diceToKeep()
    {
         Scanner sc = new Scanner(System.in);
        String strVals;
        String[] strValsArray;
        int[] intVals;
        boolean[] boolVals = { true, true, true, true, true };
        
        
        //Get which dice to keep.  This will be comma separated,
        //so their input may look like "1,2,4,5"
        //Get that value and then split it into an array based on the commas.
        //In the example above, strValsSarray would be {"1", "2", "4", "5"}
        //after the call to the .split() method.  Notice that they are all
        //still strings.
        System.out.print("Which dice to keep: Enter numbers with commas to separate >> ");
        strVals = sc.nextLine();
        strValsArray = strVals.split(",");
        
        //Declare and initialize an arry of integers that is the same length 
        //as the strValsArray.
        int[] vals = new int[ strValsArray.length];
        
        //Loop through the strValsArray and convert all of the String values
        //into integers
        for( int i = 0; i < strValsArray.length; i++)
        {
            vals[i] = Integer.parseInt(strValsArray[i]);
        }
        
        //You need to modify the boolean array to change the values 
        //from true to false for the dice specified.
        //Just remember that the value in the vals array is 1 higher than the index 
        //in the boolVals array.
        //For example, if continued with the example above then we would change the values at
        //boolVals at sub 0, sub 1, sub 4, and sub 5
        //So after this boolVals would have:  {false, false, true, false, false}
        for( int i = 0; i < vals.length; i++)
        {
            boolVals[ vals[i] - 1 ] = false; 
        }
        
       return boolVals;
    }
        
    
    
}
