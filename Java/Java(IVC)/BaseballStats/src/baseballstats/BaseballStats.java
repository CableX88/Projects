/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballstats;

/**
 *
 * @author DavidX2X
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class BaseballStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("what are the number of hits?: ");
        String hits = scan.next();
        //System.out.println("");
        System.out.print("what are the number of at-bats?: ");
        String atBats = scan.next();
        //System.out.println("");
        double percent = Double.valueOf(hits)/Double.valueOf(atBats);
        DecimalFormat dec = new DecimalFormat("0.000");
        System.out.println(dec.format(percent));
        if(Double.valueOf(dec.format(percent))>0.300)
        {
            System.out.println("The player is eligible for the All Stars Game");
            
        }else{
           System.out.println("The player is not eligible");
        }
    }
    
}
