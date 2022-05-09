package gradearray;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author David Schmidt
 */

public class GradeArray
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        
        // TODO code application logic here
        // Create an array of grades
        // Ask the user to enter the number of grades that they want to enter
        // Get the individual grades from the user and store in the array.
        // Print out the grades that were entered.
        // Print out the first grade and the last grade entered.
        // Calculate the average grade.
        // Convert the average grade to a letter grade - A, B, C, D, or F.

        Scanner sc = new Scanner(System.in);
        System.out.print("Hello World");
        int sizeOfArray; // Declare an int size of grades Array
        double[] grades; // Declaring an array of doubles
        double total=0;
        double average=0; // Declaring double vars and initialize to zero
        boolean foundGrade = false; // boolean var to help with conversion from points to letter grade
        
        double[] gradeVals = {90, 80, 70, 60, 0}; // Declare an array for boubles and assign values
        char[] gradeLetters = {'A', 'B', 'C', 'D', 'F'}; // Declare an array of chars as letter grades
       
        System.out.print("Enter the number of Grades to be entered >> ");
        sizeOfArray = sc.nextInt();  // Test Ability To Print; Clean Code with Hammer Next Time !!
        
        // Enter the grades - use a FOR LOOP to read input
        for (i=0; i < grades.length; i++)
        {
        
        }
            
            
    } // end-main()
    
} // end-class