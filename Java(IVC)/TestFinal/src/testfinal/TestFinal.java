/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfinal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DavidX2X
 */

public class TestFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
try
{
     String word = new String("avaJ");
     System.out.println( word.charAt( 3 ) );
}

catch( StringIndexOutOfBoundsException e )
{
     System.out.println( "OOPS!\n" );
}

     catch( IndexOutOfBoundsException ie )
{
     System.out.println( ie.getMessage() );
}

finally
{
     System.out.println("I’d rather be sailing\n");
}

}
    }
    

