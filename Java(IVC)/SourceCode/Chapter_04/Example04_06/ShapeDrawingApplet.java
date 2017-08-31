/* A Shape Drawing Applet
   Anderson, Franceschi
*/

import javax.swing.JApplet;
import java.awt.Graphics;

public class ShapeDrawingApplet extends JApplet
{
  public void paint( Graphics g )
  {
    super.paint( g );

    g.drawRect( 100, 50, 40, 100 );   // rectangle
    g.fillRect( 200, 70, 80, 80 );    // solid square

    g.fillOval( 100, 50, 40, 100 );   // oval inside the rectangle
    g.drawOval( 100, 200, 100, 40 );  // same-size oval
                                      // rotated 90 degrees

    int centerX = 250, centerY = 225;
    int radius = 25;
    g.drawOval( centerX - radius, centerY - radius,
                radius * 2, radius * 2 );  // circle using radius
                                           // and center
  }
}