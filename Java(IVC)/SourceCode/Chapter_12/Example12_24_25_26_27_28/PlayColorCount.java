/** PlayColorCount class
* Anderson, Franceschi
*/

import javax.swing.JFrame;
import java.awt.Color;

public class PlayColorCount
{
 public static void main( String [] args )
 {
  Color [] colors = { Color.RED, Color.GREEN, Color.BLUE };
  String [] labels = { "RED", "GREEN", "BLUE" };
  ColorFrequencyGame game
   = new ColorFrequencyGame( 8, colors, labels );
  BorderedLabelGridView gameGui
   = new BorderedLabelGridView( colors.length, game.getSize( ) );
  gameGui.setSize( 380, 300 );
  gameGui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  ColorGridGameController controller
   = new ColorGridGameController( game, gameGui );
 }
}