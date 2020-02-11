/* RollABall, Version 1
   Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class RollABall1 extends JFrame
{
   public void paint( Graphics g )
   {
      super.paint( g );

      final int MOVE = 5;         // space between balls
      final int BORDER_RIGHT = 8; // thickness of right border
      // instantiate the ball as a Circle object
      // x is 18, y is 75, diameter is 15, color is blue
      Circle ball = new Circle( 18, 75, 15, Color.BLUE );

      // get ball diameter
      int ballDiameter = ball.getDiameter( );
              
      while ( ball.getX( ) + ballDiameter < getWidth( ) - BORDER_RIGHT )
      {
          ball.draw( g );   // draw the ball

          // set x to next drawing location
          ball.setX( ball.getX( ) + ballDiameter + MOVE );
      }
   }
   
   public static void main( String [] args )
   {
      RollABall1 roll1 = new RollABall1( );
      roll1.setSize( 400, 300 );
      roll1.setVisible( true );
   }
}
