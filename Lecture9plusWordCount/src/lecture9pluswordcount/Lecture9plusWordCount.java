// Tested on Tue Evening in LMS Library.  030122a 10:26 pm e.s.t. ds
 
package lecture9pluswordcount;
import java.util.Scanner;
/**
 *
 * @author David Schmidt
 */
public class Lecture9plusWordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    
        // TODO code application logic here
        
/*      David make a plan 
        -create trivial word-counting definate loop
        -create some variables and counters
        -create For Loop
        
 */  

    String phrase;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a phrase >> ");
    phrase = sc.nextLine();
    
    for (int i=0; i < phrase.length(); i++)
    {
        if (phrase.charAt(i) == ' ')
        {
            count++;
        } // end-if
    } // end-for
    System.out.printf("There were %d spaces in the phrase.%n%n", count);

    } // main
    
} // class Lecture9plusWordCount