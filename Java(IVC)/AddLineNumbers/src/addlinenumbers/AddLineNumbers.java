/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addlinenumbers;

/**
 *
 * @author DavidX2X
 */
 import java.io.*;
import java.util.Scanner;
public class AddLineNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int Lnum = 0; //linenumber
       File file = new File("E:\\dataInput.txt");
       
       try
       {
          Scanner scan = new Scanner(file);
          FileOutputStream fout = new FileOutputStream("dataOutput.txt");
          PrintWriter writer = new PrintWriter(fout);
          String line;
          while(scan.hasNextLine())
          {
              line = scan.nextLine();
             writer.println(Lnum+1 +" "+ line);
              Lnum++;
              
          }
          writer.flush();
          scan.close();
          fout.close();
          writer.close();
          System.out.println("file has been written");
       }
      catch(IOException e){
         e.getMessage();
         e.toString();
         e.printStackTrace();
      }  
    }
    
}
