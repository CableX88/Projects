/* RollABall, Version 3
   Rolls the ball diagonally
   Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class RollABall3 extends JFrame
{
 public void paint( Graphics g )
 {
  super.paint( g );
       
  final int BORDER_TOP = 30;   // size of title bar
  final int BORDER_RIGHT = 8;  // size of window borders
  final int BORDER_LEFT = 8;
  final int BORDER_BOTTOM = 8; 
  final double PAUSE_TIME = .015; // pause time in seconds
              
  // instantiate the ball as a Circle object
  // x starts 1/2 across the window, y is at the top,
  // diameter is 15, color is blue
  Circle ball = new Circle( getWidth( ) / 2, 
                            BORDER_TOP, 15, Color.BLUE );
  // start moving the ball to the right and down
  int moveX = 1; // move the ball 1 pixel along the X axis
  int moveY = 1; // move the ball 1 pixel along the Y axis

  // get ball diameter
  int ballDiameter = ball.getDiameter( );

  // rolling diagonally down to the right
  while ( ball.getX( ) + ballDiameter < getWidth( ) - BORDER_RIGHT 
       && ball.getY( ) + ballDiameter < getHeight( ) - BORDER_BOTTOM )
  {
    ball.draw( g );  // draw the ball
           
    Pause.wait( PAUSE_TIME ); // pause 
    // erase the ball
    g.clearRect( 0, 0, getWidth( ), getHeight( ) );
           
    // adjust position of ball
    ball.setX( ball.getX( ) + moveX ); 
    ball.setY( ball.getY( ) + moveY );
  }
       
  // if ball hit the right edge, roll diagonally down to the left
  if ( ball.getX( ) + ballDiameter >= getWidth( ) - BORDER_RIGHT )
    moveX *= -1;
    
  while ( ball.getX( ) > BORDER_LEFT 
       && ball.getY( ) + ballDiameter < getHeight( ) - BORDER_BOTTOM )
  {
    ball.draw( g );  // draw the ball
           
    Pause.wait( PAUSE_TIME ); // pause 
    // erase the ball
    g.clearRect( 0, 0, getWidth( ), getHeight( ) );
           
    // adjust position of ball
    ball.setX( ball.getX( ) + moveX ); 
    ball.setY( ball.getY( ) + moveY );
  }

  // if ball hit the bottom edge, roll diagonally up
  if ( ball.getY( ) + ballDiameter >= getHeight( ) - BORDER_BOTTOM )
    moveY *= -1;
    
  while ( ball.getX( ) + ballDiameter < getWidth( ) - BORDER_RIGHT 
       && ball.getX( ) > BORDER_LEFT && ball.getY( ) > BORDER_TOP )
  {
    ball.draw( g );  // draw the ball
           
    Pause.wait( PAUSE_TIME ); // pause 
    // erase the ball
    g.clearRect( 0, 0, getWidth( ), getHeight( ) );
           
    // adjust position of ball
    ball.setX( ball.getX( ) + moveX ); 
    ball.setY( ball.getY( ) + moveY );
  }
       
  ball.draw( g );  // draw the ball
 }
    
 public static void main( String [] args )
 {
  RollABall3 roll3 = new RollABall3( );
  roll3.setSize( 300, 300 );
  roll3.setVisible( true );
 }
}