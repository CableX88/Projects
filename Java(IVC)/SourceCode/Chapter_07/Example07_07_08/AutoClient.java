/* Auto Client, Version 4
   Anderson, Franceschi
*/

public class AutoClient
{
   public static void main( String [] args )
   {
     Auto suv = new Auto( "Trailblazer", 7000, 437.5 );

     double mileage = suv.calculateMilesPerGallon( );
     System.out.println( "Mileage for suv is "
                          + mileage );
   }
}
