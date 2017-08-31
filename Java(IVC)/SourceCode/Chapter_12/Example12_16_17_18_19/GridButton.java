/** GridButton class
*   Anderson, Franceschi
*/

import javax.swing.JButton;

public class GridButton extends JButton
{
 private int row;
 private int column;

 /** Constructor
 * @param title
 * @param newRow row
 * @param newColumn column
 */
 public GridButton( String title, int newRow, int newColumn )
 {
  super( title );
  setRow( newRow );
  setColumn( newColumn );
 }

 /** getRow method, accessor for row
 * @return row
 */
 public int getRow( )
 {
   return row;
 }

 /** getColumn method, accessor for column
 * @return column
 */
 public int getColumn( )
 {
   return column;
 }

 /** setRow method, mutator for row
 * @param newRow, an int
 */
 public void setRow( int newRow )
 {
   if ( newRow >= 0 )
     row = newRow;
 }

 /** setColumn method
 * @param newColumn, an int
 */
 public void setColumn( int newColumn )
 {
   if ( newColumn >= 0 )
     column = newColumn;
 }
}