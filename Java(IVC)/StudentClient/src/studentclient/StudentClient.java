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
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Student s1,s2;
          s1 = new Student("Tyler","98748", 3.8);
          s2 = new Student("Frank", "88765", 3.3);
         
          //s1.setName("john");
        System.out.println(s1.getName());
        //s1.setSsn("78123");
        System.out.println(s1.getSsn());
        System.out.println(s1.getGpa());
        
        System.out.println(s2.ToString());
        
        if( s1.Equals(s2))
        {
            System.out.println(" true ");
        }
        else{
            System.out.println("false");
        }
        
        s2.setName("Tyler");
        System.out.println(s2.getName());
        s2.setSsn("98748");
        System.out.println(s2.getSsn());
        s2.setGpa(3.8);
        System.out.println(s2.getGpa());
        
        if( s1.Equals(s2))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
    
}
