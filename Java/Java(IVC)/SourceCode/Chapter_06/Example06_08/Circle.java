/** Circle class
*   intended for drawing circles
*   Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;

public class Circle
{
  private int x, y, diameter;   // x, y coordinates of upper left corner
                                // diameter of the circle
  private Color color;          // filled color of circle

  /** Default constructor
  *    sets (x,y)  to upper left corner of window
  *    sets default diameter of 10 pixels
  *    sets default color to black
  */
  public Circle( )
  {
     x = 0;
     y = 0;
     diameter = 10;
     color = Color.BLACK;
  }

  /** Overloaded constructor
  *    @param sX               x value upper left corner bounding rectangle
  *    @param sY               y value upper left corner bounding rectangle
  *    @param sDiameter        diameter of circle
  *    @param sColor           color of circle
  */
  public Circle( int sX, int sY, int sDiameter, Color sColor )
  {
     x = sX;
     y = sY;
     diameter = sDiameter;
     color = sColor;
  }

  /** accessor for x
  *   @return  current value of x
  */
  public int getX( )
  {
     return x;
  }

  /** accessor for y
  *   @return  current value of y
  */
  public int getY( )
  {
     return y;
  }

  /** accessor for diameter
  *   @return  current value of diameter
  */
  public int getDiameter( )
  {
    return diameter;
  }

  /** accessor for color
  *   @return  current value of color
  */
  public Color getColor( )
  {
    return color;
  }

  /**  mutator for x
  *   @param newX  new value for x
  */
  public void setX( int newX )
  {
     x = newX;
  }

  /**  mutator for y
  *   @param newY  new value for y
  */
  public void setY( int newY )
  {
     y = newY;
  }

  /**  mutator for diameter
  *   @param newDiameter new value for diameter
  */
  public void setDiameter( int newDiameter )
  {
     diameter = newDiameter;
  }

  /**  mutator for color
  *    @param  newColor new value for color
  */
  public void setColor( Color newColor )
  {
     color = newColor;
  }

  /**  draw thecircle
  *   @param  g  Graphics object
  */
  public void draw( Graphics g )
  {
     g.setColor( color );
     g.fillOval( x, y, diameter, diameter );
  }
}