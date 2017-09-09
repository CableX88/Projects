/** Using GridLayout dynamically
*     Anderson, Franceschi
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TilePuzzleViewController extends JFrame
{
 private Container contents;

 private GridButton [][] squares;
 private TilePuzzle game; // the tile puzzle game

 public TilePuzzleViewController( TilePuzzle newGame )
 {
  super( "The Tile Puzzle Game" );
  game = newGame;
  setUpGameGUI( );
 }

 public void setUpGameGUI( )
 {
  contents = getContentPane( );
  contents.removeAll( ); // remove all components
  contents.setLayout( new GridLayout( game.getSide( ),
                                      game.getSide( ) ) );
  squares = new GridButton [game.getSide( )][game.getSide( )];

  ButtonHandler bh = new ButtonHandler( );

  // for each button: instantiate button with appropriate button label,
  // add to container, and register listener
  for ( int i = 0; i < game.getSide( ); i++ )
  {
   for ( int j = 0; j < game.getSide( ); j++ )
   {
    squares[i][j] = new GridButton( game.getTiles( )[i][j], i, j );
    contents.add( squares[i][j] );
    squares[i][j].addActionListener( bh );
   }
  }

  setVisible( true );
 }

 public void update( )
 {
  for ( int i = 0; i < game.getSide( ); i++ )
  {
   for ( int j = 0; j < game.getSide( ); j++ )
   {
    squares[i][j].setText( game.getTiles( )[i][j] );
   }
  }

  if ( game.won( ) )
  {
   JOptionPane.showMessageDialog( TilePuzzleViewController.this,
         "Congratulations! You won!\nSetting up new game" );
   Random random = new Random( );
   int sideOfPuzzle = 3 + random.nextInt( 4 );
   game.setUpGame( sideOfPuzzle );
   setUpGameGUI( );
  }
 }

 private class ButtonHandler implements ActionListener
 {
  public void actionPerformed( ActionEvent ae )
  {
   GridButton button = ( GridButton ) ae.getSource( );
   if ( game.tryToPlay( button.getRow( ), button.getColumn( ) ) )
     update( );
  }
 }
}
