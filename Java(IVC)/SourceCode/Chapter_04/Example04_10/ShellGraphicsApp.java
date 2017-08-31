/* A Graphical Application shell
   Anderson, Franceschi
*/

import javax.swing.JFrame;
import java.awt.Graphics;

public class ShellGraphicsApp extends JFrame
{
  public void paint( Graphics g )
  {
    super.paint( g );
    // include graphics code here
  }
  
  public static void main( String [] args )
  {
    ShellGraphicsApp app = new ShellGraphicsApp( );
    app.setSize( 400, 300 );
    app.setVisible( true );
  }
}