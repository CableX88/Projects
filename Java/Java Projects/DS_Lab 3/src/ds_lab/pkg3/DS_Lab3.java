/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_lab.pkg3;

/**
 *
 * @author DavidX2X
 */
import java.util.ArrayList;
public class DS_Lab3 {

    
     public static ArrayList<Integer>list = new ArrayList<Integer>();
    public static void main(String[] args) 
    {
        
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(20);
        System.out.println("index = "+search(20));
    }
    public static int search(int value)
    {
         for(int i = 0; i<list.size();i++)
        {
            if(list.get(i) == value)
            {
               return i; 
            }
//            else if(i==list.size())
//            {
//               return -1; 
//            }
        }
         return -1;
    }
    
}
