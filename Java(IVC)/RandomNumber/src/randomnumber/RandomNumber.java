/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

/**
 *
 * @author DavidX2X
 */
import java.util.Random;
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Random ran = new Random();
        int r1=ran.nextInt(50);
        int r2=ran.nextInt(50);
        int r3=ran.nextInt(50);
        double avg = (r1 + r2 + r3)/3.0;
        System.out.println(avg);
        System.out.println(r1+" "+r2+" "+r3);
    }
    
}
