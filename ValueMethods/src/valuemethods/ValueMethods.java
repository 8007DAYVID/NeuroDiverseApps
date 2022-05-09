package valuemethods;
import java.util.Scanner;
// imported the file ValueMethods.zip
// runs without any changes
// tested with the following values: (1966, 1965, 2022), the smallest value is 1965.00.
// tested with the following values: (3, 4, 1).  The smallest value is 1.00.
// tested with the following values: (0.99, 0.51, 0.01).  The smallest value is 0.01.

public class ValueMethods 
{

    public static void main(String[] args) 
    {
        //declare variables
           double value1;
           double value2;
           double value3;
           
           Scanner sc = new Scanner(System.in);
           
        //Get user input
           System.out.print("Enter a numeric value >> ");
           value1 = sc.nextDouble();
           System.out.print("Enter a second numeric value >> ");
           value2 = sc.nextDouble();
           System.out.print("Enter a third numeric value >> ");
           value3 = sc.nextDouble();
           
           System.out.printf("The smallest value is %.2f%n", smallest( value1, value2, value3));
           // Alternative way
           // double smallestVal = smalles( value1, value2, value3);
           // System.out.printf("The smallest value is %.2f%n", smallestVal);
   
           // tested with the following values: (1966, 1965, 2022), the smallest value is 1965.00.
           // tested with the following values: (3, 4, 1).  The smallest value is 1.00.
           // tested with the following values: (0.99, 0.51, 0.01).  The smallest value is 0.01.
           
    } // end-main ()
    
    public static double smallest( double v1, double v2, double v3)
    {
        return Math.min( v1, Math.min(v2, v3));
    }

    public static double average( double mean1, double mean2, double mean3) 
    {
        return Math.
    }
} // end-class
