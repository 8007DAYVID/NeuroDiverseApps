package shapecalculator;
import java.util.Scanner;

public class ShapeCalculator
{

    //*********************************************************
    /*  This program currently calculates the area for three different
    /*  types of geometric figures.
    /*
    /*  Using the same structure do the following
    /*  Add a method that pressents a menu for calculating the volume of
    /*       Rectangular Prism
    /*       Triangular Prims
    /*       Cylinder
    /*
    /*  Modify the processMenu to handle this new method
    */
    /*  Add the methods to gather the necessary 
    /*  information for each of the volume calculations,
    /*  calculate the volume, and then report the volume.
    */
    /*  Modify processShapeMenu to now have two parameters
    /*       the type of calculation (area or volume)  and
    /*       the type of shape
    /*       Modify the code to handle this new information.
    /*       Don't forget to go back and update everywhere where processShapeMenu is called.
    */
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;     
        
        while( menuChoice != 999 )
        {
            printTopMenu();
            menuChoice = sc.nextInt();
            processMenu( menuChoice);
            
        }
    }
    
    public static void processMenu( int item )
    {
        Scanner sc = new Scanner( System.in);
        int shapeChoice;
        
        if( item == 1)
        {
            printAreaMenu();
            
        }
        
        shapeChoice = sc.nextInt();
        processShapeMenu( shapeChoice );
    }
    
    public static void processShapeMenu(int choice)
    {
        if( choice == 1)   //Rectangle
        {
            calcRectArea();
        }
        else if( choice == 2)
        {
            calcTriangleArea();
        }
        else if( choice == 3)
        {
            calcCircleArea();
        }
        else
        {
            System.out.println("Error: not a valid menu option");
        }
    }
    
    public static void printTopMenu()
    {
        System.out.println("*******************************");
        System.out.println("Select the type of calculation");
        System.out.println("  1.  Area");
        System.out.println("  2.  Volume");
        System.out.println("  999.  Quit");
        System.out.print("  Your selection >> ");
    }
    
    public static void printAreaMenu()
    {
        System.out.println("Select the shape");
        System.out.println("  1.  Rectangle");
        System.out.println("  2.  Triangle");
        System.out.println("  3.  Circle");
        System.out.print("  Your selection >> ");
        
    }
    
   public static void calcRectArea()
   {
       Scanner sc = new Scanner( System.in);
       double length;
       double width;
       double area;
       
       System.out.print("Enter the length of the rectangle >> ");
       length = sc.nextDouble();
       System.out.print("Enter the width of the rectangle >> ");
       width = sc.nextDouble();
       
       area = length * width;
       
       System.out.printf("The area of a %.2f x %.2f rectangle is %.2f%n", length, width, area);
   }
   
   public static void calcTriangleArea()
   {
       Scanner sc = new Scanner( System.in);
       double base;
       double height;
       double area;
       
       System.out.print("Enter the base of the triangle >> ");
       base = sc.nextDouble();
       System.out.print("Enter the height of the triangle >> ");
       height = sc.nextDouble();
       
       area = base * height * .5;
       
       System.out.printf("The area triangle with a base of %.2f and a height of %.2f is %.2f%n", base, height, area);
   }
   
    public static void calcCircleArea()
   {
       Scanner sc = new Scanner( System.in);
       double radius;
       double area;
       
       System.out.print("Enter the radius of the circle >> ");
       radius = sc.nextDouble();
       
       area = Math.PI * Math.pow( radius, 2);
       
       System.out.printf("The area circle with a radius of %.2f is %.2f%n", radius, area);
   }
}
