// David.Schmidt@ieee.org
// LESSON 13 - DemoCode (player.vimeo.comvideo400673483h=ef8ac9c732)
// Wednesday March 23, 2022 11:43pm
// Library Closing in 15 minutes

// Create a program that reads, scales, and prints a sequence of numbers.
// name the program ArrayArguments.java
// In main: call the method to read the inputs
// call the method to print the values: [Success: by 3:10am on Thr.032422a]
//   HELP: I Believed That my class was created as ArrayArguments
//    YET: Later I was getting an error, So I renamed my class to Arrayarguments
//         and it seems have fixed the issue!  However, How can I validate
//         what the name of the class actually is?  is the class an actual
//          file aka ArrayArguments.jar, or is it a virtual driver
//  located the directory !! and fixed the file name!!  Took screenshot
// call the method to scale the values [Success: by 4:23am on Thr.032422b
// call the method to print the values [Success: same, same]
//
// Read the inputs: public static int[] readInputs( int numOfInputs )
// One parameter - the number of inputs.
// Opens a scanner, and prompts the user a number of times to enter the value
// return the filled array
//
// Scale the inputs: public static void scale( int[] vals, int factor)
// Two parmeters, the array of inputs, and the factor to scale by
// Scale means to multiply each value in the array by the factor
// Update each value in the array by scaling it
// Print the array: public static void printArray( int[] numbers)
// One parameter - Array
// Iterate through the array and print each element on the same line


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package arrayarguments;
import java.util.Scanner;
 

/**
*
* @author KevinKeith
*/
public class ArrayArguments
{

/**
 * @param args the command line arguments
 */
	public static void main(String[] args)
	{
	int[] numbers = readInputs(5);  //declare an array and set it to the result of the method call
        printArray(numbers);            //calling the method to print the array
        scale(numbers, 10);             //calling the method to scale each item in the array
        printArray(numbers);
	}

	public static int[] readInputs( int numOfInputs )
	{
		Scanner in = new Scanner(System.in);
		int[] vals = new int[numOfInputs]; //declare and init an integer array
                
		for ( int i = 0; i < vals.length; i++) // for loop to fill the array by values entered by the user
		{
			System.out.print("Enter an integer >> ");
			vals[i] = in.nextInt();
                }
                
                return vals;
                
        }   // end readInputs

	public static void scale( int[] vals, int factor)
	{
            for (int i = 0; i < vals.length; i++)  // for loop to multiply or scale each vals iterations factor
            {
                vals[i] = vals[i] * factor;
            }
	} // end-for

	public static void printArray( int[] numbers)
	{
            System.out.println("Array Values ");
            for (int i=0; i < numbers.length; i++)  // using a for loop to print each item in the array
            {
                System.out.print(numbers[i] + " ");
            } // end-for
            
            System.out.println();
            
	} // end-printArray
        
} // end-class Arrayarguments