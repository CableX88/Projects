/* A Graphical Application drawing squares
   Anderson, Franceschi
*/

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class DrawSquares extends JFrame
{
  public void paint( Graphics g )
  {
    super.paint( g );
    
    g.setColor( Color.RED );
    g.fillRect( 100, 70, 50, 50 );
    
    g.setColor( Color.BLUE );
    g.fillRect( 200, 150, 75, 75 ); 
  }
  
  public static void main( String [] args )
  {
    DrawSquares app = new DrawSquares( );
    app.setSize( 400, 300 );
    app.setVisible( true );
  }
}