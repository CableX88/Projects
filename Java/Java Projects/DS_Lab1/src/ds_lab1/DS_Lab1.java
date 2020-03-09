/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_lab1;
import java.util.Scanner;
/**
 *
 *
 */
public class DS_Lab1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        System.out.println("Enter a sentance: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String[] sentance_array = sentence.trim().split(" ");
        //for( int i = 0; i <= sentance_array.length; i++)
        for(String s:sentance_array)
        {
         if(isDouble(s))
         {
             double numeric =  Double.parseDouble(s)*2;
             System.out.println(numeric);
         }
         else
         {
           System.out.println(s);
         }
             
        }
        
    }
    public static boolean isDouble(String string)
    {
       try
       {
          Double.parseDouble(string);
       }catch(Exception e){
           return false;
           
                  
       }
       return true;
    }
    
}
//run:
//Enter a sentance: 
//Hello world, there are 3.5 items
//Hello
//world,
//there
//are
//7.0
//items
//BUILD SUCCESSFUL (total time: 6 seconds)
