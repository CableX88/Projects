/* Bull's-eye target
   Anderson, Franceschi
*/

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class BullsEye extends JFrame
{
  public void paint( Graphics g )
  {
    super.paint( g );
     
    // center of bullseye
    int centerX = 200, centerY = 150;
    // color of first circle
    Color toggleColor = Color.BLACK;
    // each circle will be a Circle object
    Circle circle;

    for ( int diameter = 200; diameter >= 20; diameter -= 20 )
    {
      // instantiate circle with current diameter and color
      circle = new Circle( centerX - diameter / 2,
                           centerY - diameter / 2,
                           diameter, toggleColor );
      circle.draw( g ); // draw the circle

      if ( toggleColor.equals( Color.BLACK ) )
        toggleColor = Color.RED;   // if black, change to red
      else
        toggleColor = Color.BLACK; // if red, change to black
    }
  }
  
  public static void main( String [] args )
  {
    BullsEye bullsEye = new BullsEye( );
    bullsEye.setSize( 400, 300 );
    bullsEye.setVisible( true );
  }
}
