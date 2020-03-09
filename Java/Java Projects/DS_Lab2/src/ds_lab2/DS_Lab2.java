/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_lab2;

/**
 *
 * @author DavidX2X
 */
import java.util.Scanner;
public class DS_Lab2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Enter Array Size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int array[]= new int[size];
        for(int j = 0; j<array.length;j++)
        {
        System.out.println("Enter a number to add to array: ");
       
        int num = scan.nextInt();
       
        
        if(num == -1)
        {
            
            break;
        }
        array[j]= num;
            
        }
        for(int e:array)
        {
            System.out.println("list: "+e);
        }
    }
    
}
/*
Enter Array Size: 
5
Enter a number to add to array: 
1
Enter a number to add to array: 
2
Enter a number to add to array: 
3
Enter a number to add to array: 
4
Enter a number to add to array: 
5
list: 1
list: 2
list: 3
list: 4
list: 5
*/
