/*  ConsoleIn Client
*   Anderson, Franceschi
*/
import com.jbpub.af.ConsoleIn; // import ConsoleIn from package

public class ConsoleInClient
{
   public static void main( String [] args )
   {
      ConsoleIn console = new ConsoleIn( );

      int age = console.readInt( "Enter your age" );
      System.out.println( "Your age is " + age );
   }
}