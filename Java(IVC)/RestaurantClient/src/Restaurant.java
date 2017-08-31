/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbrown65
 */
public class Restaurant extends Store {
    int psy; // people served yearly
    double avg; // average price per meal


public Restaurant(int newpsy,double newavg,String newName)
{
 super(newName);   
psy = newpsy;
avg = newavg;
}
public int getpsy()
     {
         return psy;
     }

public double getavgP()
{
    return avg;
}

 public void setpsy( int newpsy)
     {
         if(psy <0)
         {
             System.out.print("Error!!: People served yearly cannot be less than zero");
         }
         else
         {
          psy = newpsy;   
         }
         
     }    

 public void setavg(double newavg)
 {
     if(avg <0)
         {
             System.out.print("Error!!: Average cannot be less than zero");
         }
     else
        {
         avg = newavg;
        }
              
 }
 
  public String ToString()
  {
     return  Name + " " + psy + " " + avg; 
  }
 public boolean Equals(Restaurant b)
{
 if(super.getName().equals(b.Name)&&(this.psy == b.psy)&&(this.avg == b.avg))
           return true;
           return false;   
}
 public double averageTaxes()
 {
    double res = psy * avg;
    return res /super.Taxrate;
 }
}