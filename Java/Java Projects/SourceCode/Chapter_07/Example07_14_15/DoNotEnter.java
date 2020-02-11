/* DoNotEnter class, used to draw a Do Not Enter sign
   Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;

public class DoNotEnter 
{  
  // constant for default diameter
  private final int DIAMETER = 100;
  
  // the starting x and y coordinates for the sign
  private int sX;
  private int sY;

  private double scale; // scaling factor, 1.0 is full size
  
  // Constructor
  // sets starting x and y coordinates
  //  and scaling factor
  public DoNotEnter( int startX, int startY, double startScale )
  {
    setCoordinates( startX, startY );
    setScale( startScale ); 
  }
  
  // Mutator methods:
  public void setCoordinates( int newX, int newY )
  {
    sX = newX;
    sY = newY;  
  }
  
  public void setScale( double newScale )
  {
    if ( newScale > 0 )
      scale = newScale;
    else
      scale = 1.0;
  }
  
  // draw method
  // draws sign using starting ( x, y ) coordinates
  //  and scaling factor
  public void draw( Graphics g )
  {
    g.setColor( Color.RED );
    g.fillOval( sX, sY, ( int ) ( DIAMETER * scale ), 
                        ( int ) ( DIAMETER * scale ) );
    g.setColor( Color.WHITE );
    g.fillRect( sX + ( int ) ( DIAMETER * scale  / 6 ), 
                sY + ( int ) ( 3 * DIAMETER * scale  / 8 ), 
                ( int ) ( 2 * DIAMETER * scale / 3 ), 
                ( int ) ( DIAMETER * scale / 4 ) );
  }
}