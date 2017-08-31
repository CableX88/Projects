package vehiclesclient;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbrown65
 */
public class Vehicles {
    protected String OwnerName;
    protected int NumberofWheels;
    
    
    public Vehicles(String newName,int NumberofWheels)
    {
        OwnerName = newName;
        this.NumberofWheels = NumberofWheels;
        
    } 
    public String getOwnerName()
    {
       return OwnerName; 
    }
    public void setOwnerName( String newName)
    {
        OwnerName  = newName;
    }

    public int getNumberofWheels() {
        return NumberofWheels;
    }

    public void setNumberofWheels(int NumberofWheels) {
        this.NumberofWheels = NumberofWheels;
    }
    
    public String ToString()
    {
       return OwnerName +" " + NumberofWheels; 
    }
    public boolean Equals(Vehicles b)
    {
        if(this.OwnerName.equals(b.OwnerName))
            return true;
        
        return false;
    }
    
}
