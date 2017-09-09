/* RollABall, version 2
   Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class RollABall2 extends JFrame
{
  public void paint( Graphics g )
  {
    super.paint( g );
    
    final int MOVE = 5;         // number of pixels to move the ball
    final int BORDER_RIGHT = 8; // thickness of right border
    
    // instantiate the ball as a Circle object
    // x is 18, y is 75, diameter is 15, color is blue
    Circle ball = new Circle( 18, 75, 15, Color.BLUE );

    // get ball diameter
    int ballDiameter = ball.getDiameter( );
        
    // rolling horizontally
    // check whether ball is at right edge of window
    while ( ball.getX( ) + ballDiameter < getWidth( ) - BORDER_RIGHT )
    {
       ball.draw( g );  // draw the ball

       Pause.wait( 0.03 ); // wait 3/100th of a second

       // clear the window
       g.clearRect( 0, 0, getWidth( ), getHeight( ) );
 
       // move to next location for drawing ball
       ball.setX( ball.getX( ) + MOVE ); // increment x
    }

    ball.draw( g );  // draw the ball in the current position
  }
   
  public static void main( String [] args )
  {
     RollABall2 roll2 = new RollABall2( );
     roll2.setSize( 400, 300 );
     roll2.setVisible( true );
  }
}
