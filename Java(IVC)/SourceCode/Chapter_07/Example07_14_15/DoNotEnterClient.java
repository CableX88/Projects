/* DoNotEnter client
   Anderson, Franceschi
*/

import javax.swing.JFrame;
import java.awt.Graphics;

public class DoNotEnterClient extends JFrame
{
  // instance variable is a DoNotEnter
  private DoNotEnter sign;
  
  public DoNotEnterClient( )
  {
    // instantiate the DoNotEnter object
    sign = new DoNotEnter( 150, 100, 1.0 );    
  }

  public void paint( Graphics g )
  {
    super.paint( g );
    sign.draw( g ); // draw the sign   
  }
  
  public static void main( String [] args )
  {
    DoNotEnterClient app = new DoNotEnterClient( );
    app.setSize( 400, 300 );
    app.setVisible( true );
  }
}