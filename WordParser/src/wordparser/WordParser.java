
package wordparser;
import java.util.Scanner;
public class WordParser
{

    /**************************************
     * 
     * Currently this code will ask the user for a word
     * and will print the word with one letter per line.
     * 
     * Change this code so that will print the word, but print every iteration
     * of letters separated by a dash.
     * 
     * For example:  if the user entered the word Hello
     * You should print:    H-ello
     *                      He-llo
     *                      Hel-lo
     *                      Hell-o
     * 
     * You should also print the number of iterations that printed.
     * In this example you would print:
     *                      There are 4 different iterations of Hello
     */
    public static void main(String[] args)
    {
        String userWord;
        
        Scanner sc = new Scanner( System.in);
        
        System.out.print("Enter a word >> ");
        userWord = sc.nextLine();
                
        for( int i = 0; i < userWord.length(); i++)
        {
            System.out.printf("%c%n", userWord.charAt(i));
        }
    }
    
}
