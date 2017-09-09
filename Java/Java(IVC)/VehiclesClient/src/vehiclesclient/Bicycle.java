/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesclient;

/**
 *
 * @author DavidX2X
 */
public class Bicycle extends Vehicles {
    


public Bicycle(String newName)
{
 super(newName,2);   

}

 
  public String ToString()
  {
     return  OwnerName + " " + NumberofWheels; 
  }
 public boolean Equals(Bicycle b)
{
 if(super.getOwnerName().equals(b.OwnerName)&&(this.NumberofWheels == b.NumberofWheels))
           return true;
           return false;   
}
 
} 

