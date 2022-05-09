package namegame;
import java.util.Scanner;

public class NameGame
{

    public static void main(String[] args)
    {
        Scanner iDev = new Scanner(System.in);
        String name;
        String sName;
        boolean b = false;
        boolean m = false;
        boolean f = false;
        int menuChoice = 0;
        
        printGreeting();
        System.out.print("Enter a name >> ");
        name = iDev.nextLine();
        
        sName = name.substring(1);
        b = name.toUpperCase().charAt(0) == 'B';
        m = name.toUpperCase().charAt(0) == 'M';
        f = name.toUpperCase().charAt(0) == 'F';
        
        while( menuChoice != 9)
        {
            printMenu();
            menuChoice = iDev.nextInt();
            if( menuChoice == 1)
            {
                printFirstLine( name, sName, b);
            }
            else if( menuChoice == 2)
            {
                printSecondLine(sName, f );
            }
            else if( menuChoice == 3)
            {
                printThirdLine(sName, m );
            }
            else if( menuChoice == 4)
            {
                printFullRhyme( name, sName, b, f, m );
            }
        }
        
    }
    
    public static void printMenu()
    {
        System.out.println("1.  First Line");
        System.out.println("2.  Second Line");
        System.out.println("3.  Third Line");
        System.out.println("4.  Full Rhyme");
        System.out.println("9.  Quit");
    }
    
    public static void printFirstLine(String fullName, String shortName, boolean startsWithB)
    {
        System.out.printf("%s, %s, bo-",fullName,fullName );
        if( !startsWithB)
        {
            System.out.print("b");
        }
        System.out.println(shortName);
    }
    
    public static void printSecondLine( String shortName, boolean startsWithF)
    {
        System.out.print("Bonana-fanna fo-");
        if( !startsWithF)
        {
            System.out.print("f");
        }
        System.out.println(shortName);
        
    }
    
    public static void printThirdLine( String shortName, boolean startsWithM)
    {
        System.out.print("Fee fi mo-");
        if( !startsWithM)
        {
            System.out.print("m");
        }
        System.out.println(shortName);
        
    }
    
    
    public static void printFullRhyme( String fName, String sName, boolean swB, boolean swF, boolean swM)
    {
        printFirstLine(fName, sName, swB );
        printSecondLine( sName, swF);
        printThirdLine(sName, swM );
        System.out.printf("%s!%n",fName );
    }
    
    public static void printGreeting()
    {
        System.out.println("Welcome to the Name Game");
    }
}
