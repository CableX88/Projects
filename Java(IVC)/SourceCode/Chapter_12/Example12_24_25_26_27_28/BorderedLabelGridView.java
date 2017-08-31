/** BorderedLabelGridView class
* Reusable generic frame using a BorderLayout
* containing the West and Center panels
* The West panel is made up of a vertical array of buttons
* The center panel is made up of a grid of labels
* Accessors are provided so that a Controller can access
* the array of buttons and the 2-dim array (grid) of labels
* Anderson, Franceschi
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BorderedLabelGridView extends JFrame
{
 private JPanel buttonPanel; // left, holds array of buttons
 private JButton[] buttons;
 private JPanel grid; // center, holds grid of labels
 private JLabel[][] labels; // grid of labels

 public BorderedLabelGridView( int numberOfButtons, int gridSize )
 {
  super( );

  Container contents = getContentPane( );
  contents.setLayout( new BorderLayout( ) );

  grid = new JPanel( );
  GridLayout gameGrid = new GridLayout( gridSize, gridSize );
  grid.setLayout( gameGrid );

  labels = new JLabel[gridSize][gridSize];
  for ( int i = 0; i < labels.length; i++ )
  {
   for ( int j = 0; j < labels[i].length; j++ )
   {
    labels[i][j] = new JLabel( );
    labels[i][j].setOpaque( true );
    grid.add( labels[i][j] );
   }
  }

  buttonPanel = new JPanel( );
  GridLayout buttonGrid = new GridLayout( numberOfButtons, 1 );
  buttonPanel.setLayout( buttonGrid );

  buttons = new JButton[numberOfButtons];
  for ( int i = 0; i < buttons.length; i++ )
  {
   buttons[i] = new JButton( );
   buttonPanel.add( buttons[i] );
  }

  contents.add( BorderLayout.WEST, buttonPanel );
  contents.add( BorderLayout.CENTER, grid );
  setVisible( true );
 }

 public void setButtonText( int row, String text )
 {
  buttons[row].setText( text );
 }

 public void setButtonListener( int row, ActionListener al )
 {
  buttons[row].addActionListener( al );
 }

 public void setLabelBackground( int row, int col, Color color )
 {
  labels[row][col].setBackground( color );
 }
}
