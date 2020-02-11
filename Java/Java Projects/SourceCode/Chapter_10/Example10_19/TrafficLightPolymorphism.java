/* Figure Hierarchy Client using Polymorphism
 * Anderson, Franceschi
*/
import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;

public class TrafficLightPolymorphism extends JFrame
{
  private ArrayList<Figure> figuresList;

  public TrafficLightPolymorphism( )
  {
    figuresList = new ArrayList<Figure>( );
    figuresList.add( new Square( 150, 100, Color.BLACK, 40 ) );
    figuresList.add( new Circle( 160, 110, Color.RED, 10 ) );

    figuresList.add( new Square( 150, 140, Color.BLACK, 40 ) );
    figuresList.add( new Circle( 160, 150, Color.YELLOW, 10 ) );

    figuresList.add( new Square( 150, 180, Color.BLACK, 40 ) );
    figuresList.add( new Circle( 160, 190, Color.GREEN, 10 ) );
  }

  public void paint( Graphics g )
  {
    for ( Figure f : figuresList )
         f.draw( g );
  }
  
  public static void main( String [] args )
  {
    TrafficLightPolymorphism app = new TrafficLightPolymorphism( );
    app.setSize( 340, 300 );
    app.setVisible( true );
  }
}
