/**  Simplified Auto Class with Javadoc comments
     Anderson, Franceschi
*/

public class SimplifiedAuto
{
 private String model;
 private int milesDriven;
 private double gallonsOfGas;

 
 
 /**
 * Default constructor:<BR>
 * initializes model to "unknown"<BR>
 * milesDriven are autoinitialized to 0, and gallonsOfGas to 0.0
 */
 public SimplifiedAuto( )
 {
    model = "unknown";
 }

 /**
 * Overloaded constructor:<BR>
 * Allows client to set beginning values for model,
 *   milesDriven, and gallonsOfGas<BR>
 * This constructor takes three parameters<BR>
 * Calls mutator methods to validate new values
 * @param startModel the model of the car
 * @param startMilesDriven the number of miles driven
 * @param startGallonsOfGas the number of gallons of gas used
 */
 public SimplifiedAuto( String startModel, int startMilesDriven,
                        double startGallonsOfGas )
 {
     model = startModel;
     setMilesDriven( startMilesDriven );
     setGallonsOfGas( startGallonsOfGas );
 }

 /**
 * Mutator method:<BR>
 * Allows client to set value of milesDriven<BR>
 * Prints an error message if new value is less than 0<BR>
 * <B>setMilesDriven</B> does not change the value
 * of <B>milesDriven</B> if newMilesDriven has negative value
 * @param newMilesDriven the new number of miles driven
 */
 public void setMilesDriven( int newMilesDriven )
 {
    if ( newMilesDriven > 0 )
        milesDriven = newMilesDriven;
    else
    {
        System.err.println( "Miles driven cannot be negative." );
        System.err.println( "Value not changed." );
    }
 }

 /**
 * Mutator method:<BR>
 * Allows client to set value of gallonsOfGas<BR>
 * If new value is less than 0, prints an error message<BR>
 *    and does not change the value of <B>gallonsOfGas</B>
 * @param newGallonsOfGas the new number of gallons of gas used
 */
 public void setGallonsOfGas( double newGallonsOfGas )
 {
    if ( newGallonsOfGas >= 0 )
        gallonsOfGas = newGallonsOfGas;
    else
    {
        System.err.println( "Gallons of gas cannot be negative." );
        System.err.println( "Value not changed." );
    }
 }

 /**
 * equals method:<BR>
 * Compares two SimplifiedAuto objects for the same field values
 * @param a1 another object
 * @return a boolean, true if a1 is a SimplifiedAuto object
 * and has the same field values as this object
 */
 public boolean equals( Object a1 )
 {
    if ( ! ( a1 instanceof SimplifiedAuto ) )
      return false;
    else
    {
      SimplifiedAuto objAuto = ( SimplifiedAuto ) a1;
      return ( model.equals( objAuto.model )
               && milesDriven == objAuto.milesDriven
               && Math.abs( gallonsOfGas - objAuto.gallonsOfGas )
                                         < 0.0001 );
    }
 }
}
