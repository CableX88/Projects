/* A Line Drawing Applet
   Anderson, Franceschi
*/

import javax.swing.JApplet;
import java.awt.Graphics;

public class LineDrawingApplet extends JApplet
{
  public void paint( Graphics g )
  {
    super.paint( g );

    g.drawLine( 100, 150, 100, 250 );  // a vertical line
    g.drawLine( 150, 75, 275, 75 );    // a horizontal line
    g.drawLine( 0, 0, 399, 299 );      // a diagonal line from
                                       // the upper left corner
                                       // to the lower right corner
  }
}