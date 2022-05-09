//DavidSchmidt@Landmark.edu
//L15-ArrayList(s)
//DemoCode

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradesystem;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author David Schmidt
 */
public class StudentGradeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Make a Plan
        
        ArrayList <String> names = new ArrayList <String>();
        ArrayList <Double> grades = new ArrayList <Double>();
        
        while( keepGoing() )
        {
            
        }
                
    } // end-main  
        
    
       
    public static boolean keepGoing()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter do you want to enter another? Y/N >> ");
        String response = sc.nextLine();
        return response.toUpperCase().equals("Y");
    
    } // end keepGoing
    
    public static String getName()
    {
        Scanner sc = new Scanner(System.in);
        // Finish later Thr.033122a
        
        
        
    }
    }
    
} // end-class
