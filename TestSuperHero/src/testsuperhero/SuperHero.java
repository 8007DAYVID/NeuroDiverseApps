/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsuperhero;

/**
 *
 * @author David Schmidt
 */
public class SuperHero 
{
//Class Attributes
public class TestSuperHero {
private String Name;
private String alterEgo;
private double healthPoints;
private double defencePts;

    
    


    public String getName() 
    {
        return Name;
    }

    public void setName(String Name) 
    {
        this.Name = Name;
    }

    public String getAlterEgo() 
    {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) 
    {
        this.alterEgo = alterEgo;
    }

    public double getHealthPoints() 
    {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) 
    {
        this.healthPoints = healthPoints;
    }

    public double getDefencePts() 
    {
        return defencePts;
    }

    public void setDefencePts(double defencePts)
    {
        this.defencePts = defencePts;
    }

    public TestSuperHero(String Name, String alterEgo) 
    {
        this.Name = Name;
        this.alterEgo = alterEgo;
        this.defencePts = 0;
        this.healthPoints = 50;
    }

    public TestSuperHero(String Name, String alterEgo, double defencePts) 
    {
        this.Name = Name;
        this.alterEgo = alterEgo;
        this.defencePts = defencePts;
        this.healthPoints = 50;
    }
    
    public void powerUp()
    {
        this.defencePts = this.defencePts * 2;
    }
    public void powerDown()
    {
        this.defencePts = this.defencePts / 2;
    }
    public void takeHit( int hitVal)
    {
        if( hitVal > defencePts )
        {
            healthPoints -= ( hitVal - defencePts);
        }
    }
// stopping off to WRT
}
}
