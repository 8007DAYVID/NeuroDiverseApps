/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computecommission;
import java.util.Scanner;


/**
 *
 * @author DavidSchmidt
 */
public class ComputeCommission
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Variables Defaulted To BMW M3 Luctury Sports Car Special Edution
        
        int value=75016; // February BMW M3 value Standard Model 340i, TopSpeed 155.34 MPH
        double commRate = 0.025111; // the sales-commission rate
        double commision = value*commRate;
                
        // double commision=value*commRate; // the salesmans net commision dollar amount
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        // Call Test Procedure
        printGreeting(value,commRate,commision);
    
        // Get user data for testing
        // System.out.printf("The BMW M3's Suggested Retail (List Price) with a TopSpeed of 155.34 MPH is only $%,3d U.S.D.%n",value);
        // value = sc.nextInt();
        // System.out.printf("The Standard M3 Sales Commision is: $%,3.2f%n",value*commRate);
        // commRate = sc.nextDouble();
        // System.out.printf("This BMW (2023) that costs $%,3d will net you a grand commission of $%,3.2f %n%n ",value,commision);
    
    } // end-public-main
	
	public static void printGreeting(int valueSet,double commRateSet,double commisionSet) // Welcome
	{
                System.out.print("Welcome to BMW's Top Performers Computational Commision Prediction Engine\n");
                System.out.printf("The BMW M3's Suggested Retail (List Price) with a TopSpeed of 155.34 MPH is only $%,3d U.S.D.%n%n%n",valueSet);
                Scanner scSet = new Scanner(System.in);
              
               
                // Get user data
                
                while (valueSet >= 10000 )
                {
                System.out.print("Please enter a value of an advertised-vehicle, a discounted-vehicle, (or enter -99 to quit) >> ");
                    valueSet = scSet.nextInt();
                if (valueSet !=-99 && valueSet >= 10000)
                {
                    System.out.print("Standard commision rate begins at (0.025111), please enter your desired commision rate >> ");
                    commRateSet = scSet.nextDouble();
                    System.out.printf("%n%nThis Sporty BMW, priced out at: $%,3d will net you a nice size commission check for $%,3.2f %n%n ",valueSet,valueSet*commRateSet);
                    // double commisionSet = valueSet*commRateSet;
                } // end-if
                else
                {
                    System.out.println("\n\nAre you anticipating customers wants and needs by making recommendations based on Your Predictions?");
                    System.out.println("Our Sales Predicting Engine is a win-win for your managers, your customers, and your family...\n\n");
                    
                } // end-else
                
                } // end-while      
	} // end-public-printGreeting
    
} // end-public-class
