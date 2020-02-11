/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dbrown65
 */
import java.text.DecimalFormat;
public class RestaurantClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Restaurant r1,r2;
     r1 = new Restaurant(200,4.20,"Sugarfoot's");
     r2 = new Restaurant(300,3.60,"Bob's Burgers");
     
     System.out.println(r1.ToString());
     System.out.println(r2.ToString());
     
     r2.setavg(r1.getavgP());
     r2.setpsy(r1.getpsy());
     
     if( r1.Equals(r2))
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
     r2.setName(r1.getName());
     if( r1.Equals(r2))
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
     DecimalFormat dec = new DecimalFormat("$0.00");
     System.out.println(dec.format(r1.getavgP()));
    }
    
}
