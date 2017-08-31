/* Figure Hierarchy Client
 * Anderson, Franceschi
*/
import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;

public class TrafficLight extends JFrame
{
  private ArrayList<Circle> circlesList;
  private ArrayList<Square> squaresList;

  public TrafficLight( )
  {
    squaresList = new ArrayList<Square>( );
    squaresList.add( new Square( 150, 100, Color.BLACK, 40 ) );
    squaresList.add( new Square( 150, 140, Color.BLACK, 40 ) );
    squaresList.add( new Square( 150, 180, Color.BLACK, 40 ) );

    circlesList = new ArrayList<Circle>( );
    circlesList.add( new Circle( 160, 110, Color.RED, 10 ) );
    circlesList.add( new Circle( 160, 150, Color.YELLOW, 10 ) );
    circlesList.add( new Circle( 160, 190, Color.GREEN, 10 ) );
  }

  public void paint( Graphics g )
  {
    for ( Square s : squaresList )
      s.draw( g );

    for ( Circle c : circlesList )
      c.draw( g );
  }
  
  public static void main( String [] args )
  {
    TrafficLight app = new TrafficLight( );
    app.setSize( 340, 300 );
    app.setVisible( true );
  }
}
