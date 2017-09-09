/* ColorGridGame interface
 * Anderson, Franceschi
*/

import java.awt.Color;

public interface ColorGridGame
{
 public String getTitle( );
 public int getSize( );
 public int getNumberOfColors( );
 public String getLabel( int index );
 public int getIndex( String label );
 public boolean isCorrect( int index );
 public Color getGridColor( int row, int col );
}