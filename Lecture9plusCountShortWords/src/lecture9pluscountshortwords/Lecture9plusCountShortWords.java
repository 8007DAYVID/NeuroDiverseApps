/*      Tested on Tue Evening in LMS Library, 030122b 11:45 pm, e.s.t.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture9pluscountshortwords;
import java.util.Scanner;
/**
 *
 * @author David Schmidt
 */
public class Lecture9plusCountShortWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        /*  David make a plan
            -create trivial small-word-counting
             using an indefinite loop
             -create some variables
             -create while loop
        */
       
        String word ="";
        
        int count = 0;
        Scanner sc = new Scanner(System.in);
        
        while ( !word.equals("STOP"))
        {
            System.out.print("Enter a word (enter STOP to end) >> ");
            word = sc.nextLine();
            if (word.length() <=3 )
            {
                count++;
            }
        }
        System.out.printf("Count of short words: %d %n", count);
        
        
    
    } // main
    
} // class
