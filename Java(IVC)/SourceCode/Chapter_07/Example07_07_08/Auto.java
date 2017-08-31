/* Auto class, Version 4
   Anderson, Franceschi
*/

public class Auto
{
     // instance variables
     private String model;          //  model of auto
     private int milesDriven;       //  number of miles driven
	  private double gallonsOfGas;   //  number of gallons of gas
	  
     // Default constructor:
     //  initializes model to "unknown";
     //  milesDriven is auto-initialized to 0
     //        and gallonsOfGas to 0.0
     public Auto( )
     {
        model = "unknown";
     }

     // Overloaded constructor:
     // allows client to set beginning values for
     //   model, milesDriven, and gallonsOfGas.
     public Auto( String startModel,
                  int startMilesDriven,
                  double startGallonsOfGas )
     {
        model = startModel;
        setMilesDriven( startMilesDriven );
        setGallonsOfGas( startGallonsOfGas );
     }

     // Accessor method:
     // returns current value of model
     public String getModel( )
     {
        return model;
     }

     // Accessor method:
     // returns current value of milesDriven
     public int getMilesDriven( )
     {
        return milesDriven;
     }

     // Accessor method:
     // returns current value of gallonsOfGas
     public double getGallonsOfGas( )
     {
        return gallonsOfGas;
     }

     // Mutator method:
     // allows client to set model
     public void setModel( String newModel )
     {
         model = newModel;
     }

     // Mutator method:
     // allows client to set value of milesDriven;
     // prints an error message if new value is less than 0
     public void setMilesDriven( int newMilesDriven )
     {
        if ( newMilesDriven >= 0 )
           milesDriven = newMilesDriven;
        else
        {
          System.err.println( "Miles driven cannot be negative." );
          System.err.println( "Value not changed." );
        }
     }

     // Mutator method:
     // allows client to set value of gallonsOfGas;
     // prints an error message if new value is less than 0.0
     public void setGallonsOfGas( double newGallonsOfGas )
     {
        if ( newGallonsOfGas >= 0.0 )
         gallonsOfGas = newGallonsOfGas;
        else
        {
         System.err.println( "Gallons of gas cannot be negative." );
         System.err.println( "Value not changed." );
        }
     }

     // Calculates miles per gallon.
     //  if no gallons of gas have been used, returns 0.0;
     //  otherwise, returns miles per gallon
     //        as milesDriven / gallonsOfGas
     public double calculateMilesPerGallon( )
     {
        if ( gallonsOfGas != 0.0 )
          return milesDriven / gallonsOfGas;
        else
          return 0.0;
     }
 }
