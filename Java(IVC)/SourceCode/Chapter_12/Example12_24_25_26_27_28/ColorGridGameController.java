/** ColorGridGameController class
* Anderson, Franceschi
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorGridGameController implements ActionListener
{
 private ColorGridGame model;
 private BorderedLabelGridView view;

 public ColorGridGameController( ColorGridGame newModel,
                                 BorderedLabelGridView newView )
 {
  model = newModel;
  view = newView;
  setUpGame( );
 }

 public void setUpGame( )
 {
  view.setTitle( model.getTitle( ) );
  setUpLabels( );
  setUpButtons( );
 }

 public void setUpLabels( )
 {
  for ( int i = 0; i < model.getSize( ); i++ )
   for ( int j = 0; j < model.getSize( ); j++ )
    view.setLabelBackground( i, j, model.getGridColor( i, j ) );
 }

 public void setUpButtons( )
 {
  for ( int i = 0; i < model.getNumberOfColors( ); i++ )
  {
   view.setButtonText( i, model.getLabel( i ) );
   view.setButtonListener( i, this );
  }
 }

 public void actionPerformed( ActionEvent ae )
 {
  JButton button = ( JButton ) ae.getSource( );
  int index = model.getIndex( button.getText( ) );

  if ( model.isCorrect( index ) )
   JOptionPane.showMessageDialog( view, "You won" );
  else
   JOptionPane.showMessageDialog( view, "Sorry, you lost" );
  // disable buttons here
 }
}
