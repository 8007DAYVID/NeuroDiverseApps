package testpizza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stem TV
 */
public class Pizza
{
    private String crustType;
    private int numberOfToppings;
    private char size;
    private double price;
    
    public String getCrustType()
    {
        return crustType;
    }
    
    public void setCrustType( String crustType)
    {
        this.crustType = crustType;
    }
    
    public int getNumberOfToppings()
    {
        return numberOfToppings;
    }
    
    public void setNumberOfToppings( int numberOfToppings)
    {
        if( numberOfToppings > 0)
        {
            this.numberOfToppings = numberOfToppings;
        }
    }
    
    public char getSize()
    {
        return size;
    }
    
    public void setSize( char size)
    {
        if( size == 'S' || size == 'L')
        {
            this.size = size;
        }
        
    }
    
    public double getPrice()
    {
        if( size == 'S')
        {
            price = 6.99 + (2.5 * numberOfToppings);
        }
        else if( size == 'L')
        {
            price = 12.50 + (3 * numberOfToppings);
        }
        return price;
    }
}
