
package evenentryloop;
import java.util.Scanner;
public class EvenEntryLoop
{

    /************************************************
     * This program should work this way:
     * 
     * The user should be prompted to enter an even number or 999 to quit.
     * When a user enters an even number, display the "good job" and the number entered.
     * When a user enters an odd number, display an error message.
     * Keep prompting the user to enter values until the user types 999
     * 
     * When the user types 999, the program should then display the number of times
     * that the user entered an even number
     */
    public static void main(String[] args)
    {
        Scanner iDev = new Scanner(System.in);
        int value = 0;
        int count = 0;
        
        System.out.print("Enter an even number (Enter 999 to quit)");
        value = iDev.nextInt();
        
        while( value != 999)
        {
            if( value != 999 )
            {
                if( value % 2 == 0 )
                {
                    count++;
                    System.out.printf("Good job, %d is an even number%n", value);
                }
                else
                {
                    System.out.printf("Try again.  %d is not an even number%n", value);
                }
            }
            System.out.printf("You entered %d even numbers%n", count);
        }
        
        
    }
    
}
