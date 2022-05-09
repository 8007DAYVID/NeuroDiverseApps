package factorial;
import java.util.Scanner;

public class Factorial
{

    /******************************
     * This program should calculate the factorial of a number
     * 
     * Because of the limits of Java, the value should be between 1 and 12 (inclusive)
     * 
     * A factorial the product of an integer and all the integers below it.We write that as X!, where the ! means factorial
 So 5! would be 1 * 2 * 3 * 4 * 5 = 120
 12! would be 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12  = 479,001,600
 
 We don't want to have values below 1 or above 12, so check for those errors was well.
     * For testing here are the factorials from 1 to 12
  2! = 2
  3! = 6
  4! = 24
  5! = 120
  6! = 720
  7! = 5040
  8! = 40320
  9! = 362880
 10! = 3628800
 11! = 39916800
 12! = 479001600
     * 
     * @param args
     * @author DavidSchmidt
     */
    public static void main (String [] args )
    {
        int i;
        int userVal = 0;  // my user-assgined !n value
        int factorial=1;  // n * (n-1) * (n-2) * (n-3) * (n-4);
        Scanner sc = new Scanner(System.in);
        
        while( userVal !=-99 )
        {
        System.out.print("Enter a value between (1 and 12) >> ");
               userVal = sc.nextInt();


            if( userVal >= 1 && userVal <= 12)
            {
                for( i = userVal; i >=1 ; i-- )
                {
                    
                    factorial = (factorial * i);
                 
                    // factorial = factorial * (userVal--);
                    System.out.printf("userVal is %d%n factorial equals %d where i is %d.",userVal,factorial,i);
                } // end-for-loop
            
            System.out.printf("The factorial of %d!, is %d %n ", userVal, factorial);
            factorial=1;

            } //end-if
            else if (userVal != -99)
            {
                System.out.println("Error: Invalid value, try again!");
            } // end else if
            else
            {
            System.out.print("Now Exitiing, Factorial Computational Software.\n\n");
            } //end else
        // factorial =0;
        } // end-while
    } // end main
    
} // end class