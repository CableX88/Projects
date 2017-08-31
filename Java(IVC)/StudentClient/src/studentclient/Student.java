/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclient;

/**
 *
 * @author dbrown65
 */
public class Student {
     String Name;
     String Ssn;
     double Gpa;
     
     public Student( String newName, String newSsn, double newGpa)
     {
         Name = newName;
         Ssn  = newSsn;
         Gpa  = newGpa;
     }
     public String getName()
     {
         return Name;
     }
     public void setName( String newName)
     {
         Name = newName;
     }
     public String getSsn()
     {
         return Ssn;
     }
     public void setSsn(String newSsn)
     {
         Ssn = newSsn;
     }
     public void setGpa(double newGpa)
     {
         if(Gpa <=0 || Gpa > 4.0)
         {
             System.out.print("Error!!: GPA cannot be less than or equal to zero"
                     + " or exceed the max of 4.0");
         }
         else
         {
            Gpa = newGpa;
         }
     }
     public double getGpa()
     {
        
              return Gpa;
        
     }
 public String ToString()
 {
     return Name + " " + Ssn + " " + Gpa ;
 }
public boolean Equals(Student b){
   if(this.Name.equals(b.Name)&&(this.Ssn.equals(b.Ssn))&&(this.Gpa == b.Gpa))
           return true;
   
   
      return false;
    
}

}
// ch 7 pg 405 autoclient class
// 