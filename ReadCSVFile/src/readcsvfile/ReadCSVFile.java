/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
 * Read in a file that uses comma seperation.
 * Have the user specifiy the input file input and output file names.
 * Write each individual value out to a different file, with one value per line.
 * Also keep a total and the average (rounded to 2 decimal places).
 */

package readcsvfile;
import java.io.File;                  //Import File class represents a file or directory path
import java.io.FileNotFoundException; //Import failed to open the file or path
import java.io.PrintWriter;           //Prints formatted representations of objects
import java.util.Scanner;             

/**
 * This program reads a file w/ numbers, and writes the numbers to another file, lined up
 * in a column and followed by their total.
 * Methods in this class never throw I/O exceptions, although some of its constructors
 * may. The client may inquire as to whether any errors have occurred by invoking checkError()
 */


/**
 *
 * @author David Schmidt
 */
public class ReadCSVFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // Prompt for the input file names
        Scanner sc = new Scanner(System.in);
        String inputFileName="";
        int fileCounter =1;
            while (!inputFileName.equals("exit"))
            {  
                System.out.printf("Enter input file name %d (enter 'exit' to continue >> ",fileCounter);
                inputFileName = sc.next();
                fileCounter++;
            }// end-while
        
        // Prompt for one output file name
        System.out.print("Enter output file name >> ");
        String outputFileName = sc.next();
        
     //construct the Scanner (input) and PrintWriter (output) files
     
     File inputFile = new File(inputFileName);
     Scanner fIn = new Scanner(inputFile);
     PrintWriter fOut = new PrintWriter(outputFileName);
    
     double total=0;
     String val; //read numbers into a String, then convert back to numbers
     
     while( fIn.hasNextLine())
             {
                val = fIn.nextLine();
                // String [] vals = val.split("\t");
                   String [] vals = val.split(",");
                
                for ( String v : vals) // Extended for-Loop
                {
                    Float vd = Float.parseFloat( v );
                    System.out.printf("%.2f", vd);
                    fOut.printf("%15.2f%n",vd);
                    total+=vd; // sums each iteration
                    
                }// end-for
             }  //end-while
     fOut.printf("Total %8.2f%n", total);
     fIn.close();
     fOut.close();
             
    }// end-main
     
       
}// end-class
