package trytocomparestrings.app;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author David Schmidt, CS Major & CS-1 Student
 */
public class TryToCompareStringsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String aName="Carmen";
        String anotherName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name >> ");
        anotherName = input.nextLine();

        if (aName.equals(anotherName))  // no currly braces Mom
            System.out.println(aName + " equals " + anotherName);

        else // no currly braces Dad
            System.out.println(aName + " does NOT equal " + anotherName);

        // Tested Perfect, first time around, Professor thanks for teaching us about .equals()
        // Seems that == is a pointer to the memory location
        // Where equals(), searches out the actual text
        // Another helpful method can be is CompareTo()
    } // end main
    
} // end class TryToCompareStringsApp
