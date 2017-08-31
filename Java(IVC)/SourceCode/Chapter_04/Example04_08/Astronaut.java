 /* An applet with graphics
    that draws an astronaut
    Anderson, Franceschi
 */

 import javax.swing.JApplet;
 import java.awt.Graphics;

 public class Astronaut extends JApplet
 {

   public void paint( Graphics g )
   {
      super.paint( g );

      int sX = 95, sY = 20; // starting x and y coordinate

      // helmet
      g.drawOval( sX + 60, sY, 75, 75 );
      g.drawOval( sX + 70, sY + 10, 55, 55 );

      // face
      g.drawOval( sX + 83,  sY + 27, 8, 8 );
      g.drawOval( sX + 103, sY + 27, 8, 8 );
      g.drawLine( sX + 97, sY + 35, sX + 99, sY + 43 );
      g.drawLine( sX + 97, sY + 43, sX + 99, sY + 43 );
      g.drawOval( sX + 90, sY + 48, 15, 6 );

      // neck
      g.drawRect( sX + 88, sY + 70, 20, 10 );

      // torso
      g.drawRect( sX + 65, sY + 80, 65, 85 );

      // arms
      g.drawRect( sX, sY + 80, 65, 20 );
      g.drawRect( sX + 130, sY + 80, 65, 20 );

      // legs
      g.drawRect( sX + 75, sY + 165, 20, 80 );
      g.drawRect( sX + 105, sY + 165, 20, 80 );

      // flag
      g.drawLine( sX + 195, sY + 80, sX + 195 , sY );
      g.drawRect( sX + 195, sY, 75, 45 );
      g.drawRect( sX + 195, sY, 30, 25 );

      // caption
      g.drawString( "One small step for man. . .",
                     sX + 25, sY + 270 );
   }
}

