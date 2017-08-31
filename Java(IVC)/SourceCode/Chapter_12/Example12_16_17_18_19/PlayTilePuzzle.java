/** PlayTilePuzzle class
*     Anderson, Franceschi
*/

import javax.swing.JFrame;

public class PlayTilePuzzle extends JFrame
{
 public static void main( String [] args )
 {
  TilePuzzle puzzle = new TilePuzzle( 3 );
  TilePuzzleViewController puzzleGui 
    = new TilePuzzleViewController( puzzle );
  puzzleGui.setSize( 300, 300 );
  puzzleGui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 }
}