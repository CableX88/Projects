/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;

/**
 *
 * @author dbrown65
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int q = 0;//quarters
        int d = 0; //dimes
        int n = 0; // nickles
        Scanner scan = new Scanner(System.in);
        System.out.print("How many quarters?:  ");
        q = scan.nextInt();
        System.out.print("How many dimes?:  ");
        d = scan.nextInt();
        System.out.print("How many nickles?:  ");
        n = scan.nextInt();
        
        double dollars;
        
        dollars =(0.25 * q)+ (0.10 * d)+
                (0.05 * n);
        
        DecimalFormat dec = new DecimalFormat("$0.00");
        System.out.print("the dollar amount is: "
        + dec.format(dollars));
        
        
        
        
        
       
    }
    
}
