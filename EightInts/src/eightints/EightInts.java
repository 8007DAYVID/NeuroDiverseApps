// David.Schmidt@ieee.org
// L12-Debug from EightInts.zip
// Tue.032222a
// Due Mon.032822 by 9am

package eightints;

public class EightInts
{

    public static void main(String[] args)
    {
        //declare an array with space for 8 integers
 
           int [] eightInts = new int[7];  // replaced double to int and added array brackets
        // int [] eightInts = {100, 200, 300, 400, 500, 600, 700, 800};
        
        //fill the array with the values 100, 200, 300, 400, 500, 600, 700, and 800
        for(int i = 0; i <= eightInts.length; i++)
        {
           // eightInts[i] = (i + 1 ) * 100;
              eightInts[i] = (i +1);
        }
        
        //print the message about how the array will be printed, on its own line.
        //print the array values in index order from first to last
        //there should be a space between every number that is printed and they should all be printed on the same line.
        System.out.print("Printed in order from first to last: ");
        for( int anInt : eightInts)
        {
            System.out.printf("%d ",anInt);
        }
        System.out.println();
        
        //print the mssage about how the array will be printed, on its own line.
        //print the array values in index order from last to first
        //there should be a space between every number that is printed and they should all be printed on the same line.
        System.out.print("Printed in order for last to first: ");
        for( int i = eightInts.length; i > 0; i--)
        {
            System.out.print( eightInts );
        }
        System.out.println();
        
        
    }
    
}
