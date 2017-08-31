/** Type-Safe Input Using Scanner
*   Anderson, Franceschi
*/
package com.jbpub.af;

import java.util.Scanner;

public class ConsoleIn
{
    private Scanner scan;

    public ConsoleIn( )
    {
      scan = new Scanner( System.in );
    }

    public int readInt( String prompt )
    {
       System.out.print( prompt + " > " );
       while ( ! scan.hasNextInt( ) )
       {
          String garbage = scan.nextLine( );
          System.out.println( "Input is not an integer" );
          System.out.print( prompt + " > " );
       }
       return scan.nextInt( );
    }
}
