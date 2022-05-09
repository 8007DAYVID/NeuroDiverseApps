/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package processphrase.l10.predict.multimethods;
import java.util.Scanner;

/**
 *
 * @author David Schmidt
 *
 * Typed code in by scratcch from today's Handout
 *
 *  Should have downloaded the zip file Lession10Predict.zip from Canvas,
 *  	because then I would not have misspelled Didgit as Digital.
 */
public class ProcessPhraseL10PredictMultiMethods
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String userPhrase;
        Scanner sc = new Scanner( System.in);
        
        System.out.print("Enter a word or phrase: >> ");
        userPhrase = sc.nextLine();
        processPhrase( userPhrase );
    }
    
    public static void processPhrase( String phrase)
    {
        for( int i = 0; i < phrase.length(); i++)
        {
            System.out.printf("%c in %s is: ", phrase.charAt(i), phrase);
            charIsAlphabetic( phrase.charAt(i));
            charIsDigit( phrase.charAt(i));
            charIsUppercase( phrase.charAt(i));
            System.out.println();
        } // end-for
    } // end-processPhrase

    public static void charIsAlphabetic( char aLetter )
    {
        if( Character.isAlphabetic(aLetter))    // a to z or A to Z
            System.out.print( "Alphabetic ");
    
    } // end-charIsAlphabetic

    public static void charIsDigit( char aLetter)
    {
        if( Character.isDigit( aLetter ))   // 0 to 9
            System.out.print( "Digit ");
    }
    
    public static void charIsUppercase( char aLetter)
    {
        if( Character.isUpperCase(aLetter)) // upper case alpha letter
            System.out.print("Upper ");
    }

    
} // end-class
