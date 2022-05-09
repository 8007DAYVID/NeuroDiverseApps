package Statistics;
import java.util.Scanner;
// import java.io.IOException; 
// CommonLoop(L9-Make) Algorithms
// Great Job on your Midterms with Linda Kerr & Kevin Keith !!!

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author David Schmidt
 */

public class Statistics
{
    
    public static void main (String [] args)
    {
        
    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
    
        System.out.print("This program reads in a set of double data values for each CS-1 Students: \n\n");

	int avg;
	int count = 1;
        int grade = 0;
	int sum = 0;
        Scanner sc = new Scanner(System.in);    
        while (grade != 999)
        {
            System.out.printf("CSC-1635: Enter a grade for each student starting with Student [No. %d], (0.00 to 100.0 or 999 to quit:  ",count);
            grade = sc.nextInt();
            if (grade >= 0 && grade <= 100)
            {
                sum += grade; // sum = sum + grade
                System.out.printf("The Average Grade Point Average (GPA), for our %d STEM Students during CS-1, was %d. %n%n%n",count,grade);
                count ++;
                
            } // end-if
            else if (grade == 999)
            {
                count --;
                System.out.printf("Calculating Average Student Grade ...\n\n");

            } // end-else-if         
            else if (grade >100 || grade <-1)
            {
                System.out.print("Invalid Grade entry.  Please try again: \n\n");
            } // end-else-if
            
        } // end-while
    
        if (count != 0)
        {
            avg = (sum / count);
            System.out.printf("The Average GPA for our %d students in CS-1 was: %.2f%n%n",count,(double)avg);
        }

    } // main
    
} // class