/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtemp;
import java.io.FileNotFoundException;

/**
 *
 * @author David Schmidt
 */
public class Temperature
{
//class attributes - instance variables
private double degrees;
private char scale;
char C=0;

//degrees access methods both a get and set
public double getDegrees()
{
    return degrees;
}// end-getDegrees

public void setDegrees( double degrees)
{
    this.degrees = degrees;
}//end-setDegrees

//scale access methods - both a get and set
public char getScale()
{
    return scale;
}//end-getScale


public void setTemperatureScale(char temperatureScale) //c=celcius or f=farenheit
{
    if (temperatureScale == 'c' || temperatureScale == 'f')
    {
        temperatureScale = Character.toUpperCase(temperatureScale);
    } //end-if
    if (temperatureScale == 'C' || temperatureScale == 'F')
    {
        scale = temperatureScale;
    }// end-if
    else
    {
        throw new IllegalArgumentException("Invalid Temperature Scale");
    }// end-else
}   
public String getTemperatureScale()
            {
                if( temperatureScale == 'C')
                {
                    return "Celcius";
                }// end-if
                if( temperatureScale == 'F')
                {
                    return "Farenheit";
                }// end-if
                
            }// end getTemperatureScale


    public void convert
    {
        if(scale == 'C')
        {
            degrees = (degrees * 9.0/3.0 + 32);
            scale = 'F';
        }// end-if
        else if( scale == 'F')
                {
                    degrees = (degrees - 32 *5.0/9.0);
                    scale = 'C';
                }// end else-if
        else
        {
            throw new IllegalArgumentException("Temp type not set");      
        } //end else
            
    
    }//end convert

// } //end-Temp-class
