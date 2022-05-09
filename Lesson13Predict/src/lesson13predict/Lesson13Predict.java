// No More Predict; Just Run


package lesson13predict;
import java.util.Scanner;

public class Lesson13Predict
{

    public static void main(String[] args)
    {
        boolean[] rollDice = new boolean[5];
        int rollNumber = 1;
        
        System.out.println("Your current roll: 3 6 6 1 3");
        rollDice = diceToKeep();
        
        //for testing purposes only
        System.out.println("Dice to reroll (true = roll again, false = keep)");
        for( boolean reroll: rollDice )
        {
            System.out.print( reroll + " ");
        }
        System.out.println();
        
    }
    
    public static boolean[] diceToKeep( )
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
