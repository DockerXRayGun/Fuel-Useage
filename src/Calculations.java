/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ludwig
 */
public class Calculations {
    
    private float price;
    
    private float landrover = 12/100f; //this is fuel per 1km
    
    public Calculations(float r)
    {
        price = r;
    }
    
    
    public float calculateFuel(float km) //how much fuel
    {
        km = km * landrover;
        return km;
    }
    
    public float calculatePrice(float km) //fuel cost
    {
        return price * km;
    }
    
}
