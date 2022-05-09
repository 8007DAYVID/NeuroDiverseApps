// David.Schmidt@ieee.org
// Lesson 14 - [2D] Arrays
// Not Found in JF's Text
// Sun.032722a
// DemoCode


//Initalize a single dimension array with the names of 4 students.
//Create a double dimention array with a row for each student, and space for 3 grades (integer).
// How many rows, David?  Four (4) Rows, one for each student.
// How many columns, David?  Four (4) Columns, studentName, math1A, math1B, math1C (Grades).
//
//[1] Get user input for each of the (three) grades for each of the (four) students.
//[2] Print out the grades, and then average the (three) grades for each of the (four) students.
//


package studentgrades;
import java.util.Scanner;

/**
 *
 * author DavidSchmidt
 */
 
public class StudentGrades
{


/**
 * @param args the command line arguments
 */


	public static void main(String[]args)
	{
	
	String [] names = {"Bob", "Jane", "Jack", "Jill"};    //Declare and assign values to String [1D] array
	
	int [][] grades = new int [names.length][3];	// declare double dimension array of intengers
	
	
	
	getInput( grades, names );
        printOutput (grades, names);


	
	} // end-main
	
	public static void getInput ( int [] [] studentGrades, String [] studentNames)
	{
		Scanner sc = new Scanner(System.in);
		// get input
		
		for ( int i = 0; i < studentGrades.length; i++) // iterage through double dim array and assign values
		{

			for ( int j = 0 ; j < studentGrades[i].length; j++ )  // get student grade input from user
			{
				System.out.printf("%s: Enter a grade of %d of %d >> ",studentNames[i], j+1, studentGrades[i].length );
				studentGrades[i][j] = sc.nextInt();		// assigning a value to the double dim array
					
			}   // end-studentMathGrades
			
		}   // end-studentNames
		
		// return (studentGrades)
	
        } // end-getInput
        
        public static void printOutput (int [][] sGrades, String [] sNames)
        {
	
            double total = 0;
            double average = 0;
           
            // iterate through a double dim (dd) array, and print each value
            for ( int i = 0; i < sGrades.length; i++)
            {
                System.out.printf("Name: %s %n", sNames[i]);
                System.out.printf("Test Grades: ");
                total = 0;
                average = 0;
                for ( int j = 0; j < sGrades[i].length; j++)
                {
                    System.out.printf("%3d ", sGrades[i][j]);
                    total += sGrades[i][j];
                } 
                // average = total / sGrades.length;
                average = total / sGrades[i].length;
                System.out.printf("Average: %.2f %n%n",average);
                
            } 
        } // end-PrintOut

} // end-Class StudentGrades