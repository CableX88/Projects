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
public class MotorizedVehicle extends Vehicles {
    protected double edis; //engine displacement
    protected double NumberofWheels;
    


public MotorizedVehicle(String OwnerName,int NumberofWheels, double edis)
{
 super(OwnerName,NumberofWheels);
 this.edis = edis;
 this.NumberofWheels = NumberofWheels;

}

 
  public String ToString()
  {
     return  OwnerName + " " + NumberofWheels +" "+ edis; 
  }
 public boolean Equals(MotorizedVehicle b)
{
 if(super.getOwnerName().equals(b.OwnerName)&&(this.NumberofWheels == b.NumberofWheels))
           return true;
           return false;   
}
 public double getHorsePower()
 {
     
     return (double)NumberofWheels * edis;
 }
}