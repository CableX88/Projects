/* An applet with graphics
   that draws an astronaut in color
   Anderson, Franceschi
*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Color;

public class AstronautWithColor extends JApplet
{

  public void paint( Graphics g )
  {
    super.paint( g );

    // instantiate a custom color
    Color spacesuit = new Color( 195, 175, 150 );

	int sX = 100;  // the starting x position
    int sY = 25;   // the starting y position

    // helmet
    g.setColor( spacesuit );
    g.fillOval( sX + 60, sY, 75, 75 );
    g.setColor( Color.LIGHT_GRAY );
    g.fillOval( sX + 70, sY + 10, 55, 55 );

    // face
    g.setColor( Color.DARK_GRAY );
    g.drawOval( sX + 83,  sY + 27, 8, 8 );
    g.drawOval( sX + 103, sY + 27, 8, 8 );
    g.drawLine( sX + 97, sY + 35, sX + 99, sY + 43 );
    g.drawLine( sX + 97, sY + 43, sX + 99, sY + 43 );
    g.drawOval( sX + 90, sY + 48, 15, 6 );

    // neck
    g.setColor( spacesuit );
    g.fillRect( sX + 88, sY + 70, 20, 10 );

    // torso
    g.fillRect( sX + 65, sY + 80, 65, 85 );

    // arms
    g.fillRect( sX, sY + 80, 65, 20 );
    g.fillRect( sX + 130, sY + 80, 65, 20 );

    // legs
    g.fillRect( sX + 75, sY + 165, 20, 80 );
    g.fillRect( sX + 105, sY + 165, 20, 80 );

    // flag
    g.setColor( Color.BLACK );
    g.drawLine( sX + 195, sY + 80, sX + 195 , sY );
    g.setColor( Color.RED );
    g.fillRect( sX + 195, sY, 75, 45 );
    g.setColor( Color.BLUE );
    g.fillRect( sX + 195, sY, 30, 25 );

    // caption
    g.setColor( Color.BLACK );
    g.drawString( "One small step for man...",
                    sX + 25, sY + 270 );
  }
}