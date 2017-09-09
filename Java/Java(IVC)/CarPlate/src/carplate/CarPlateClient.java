/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carplate;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author DavidX2X
 */
public class CarPlateClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        CarPlate car1 = new CarPlate("2M31SP","California","red");
        CarPlate car2 = new CarPlate("3G31XP","Florida","blue");
        CarPlate car3 = new CarPlate("T1MMAY","Texas","green");
        File file = new File("Plate.txt");
        try //try catches exceptions
        {
            
        /*
        FileWriter writer = new FileWriter(file); //creates the writer
        writer.write(car1.getNumber()+ " " +car1.getState()+ " "+car1.getColor());// writes the file
        writer.flush(); // saves file
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());
        scan.close(); //closes the scanner
        writer.close(); //
           oses the writer
                */
            FileOutputStream fos = new FileOutputStream("objects",false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(car1);
            oos.writeObject(car2);
            oos.writeObject(car3);
            oos.close();
            
        }catch(IOException e){ // catch gets the error 
            e.printStackTrace();
        }
        
        try{
            
        
        FileInputStream fis = new FileInputStream("objects ");
            ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            
            while(true){
                CarPlate temp = (CarPlate)ois.readObject();
                 System.out.println(temp.toString());
                 temp = (CarPlate)ois.readObject();
                 System.out.println(temp.toString());
                 temp = (CarPlate)ois.readObject();
                 System.out.println(temp.toString());
                
                
            }
        }
         catch(EOFException eofe){
            System.out.println("end of file reached");
        }catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
        }
        finally{
            System.out.println("closing file");
            ois.close();
        }
        
        }
        // look at chapter 11
    catch(FileNotFoundException fnfe){
    System.out.println("unable to find objects");
}catch(IOException ioe){
    ioe.printStackTrace();
}
    
}
}
