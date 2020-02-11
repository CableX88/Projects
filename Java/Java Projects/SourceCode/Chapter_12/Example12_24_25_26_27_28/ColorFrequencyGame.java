/** ColorFrequencyGame class
 Anderson, Franceschi
 */

import java.util.Random;
import java.awt.Color;
public class ColorFrequencyGame 
       implements ColorGridGame
{
 private final int DEFAULT_SIZE = 8;
 private Color [][] gridColors;
 private Color [] coloringColors;
 private int [] counts; // color frequencies in gridColors

 private String [] labels;

 /** Constructor
 * @param size number of rows and columns in gridColors
 * @param colors coloringColors
 * @param newLabels labels
 */
 public ColorFrequencyGame( int size, Color [] colors,
                            String [] newLabels )
 {
  if ( size <= 0 )
   size = DEFAULT_SIZE;
  gridColors = new Color[size][size];
  coloringColors = colors;
  counts = new int[coloringColors.length];
  fillGridWithColors( );
  labels = newLabels;
 }

 /** fillGridWithColors method
 * randomly fills gridColors with colors from coloringColors
 */
 public void fillGridWithColors( )
 {
  Random random = new Random( );
  for ( int i = 0; i < gridColors.length; i++ )
  {
   for ( int j = 0; j < gridColors[i].length; j++ )
   {
    int colorIndex = random.nextInt( coloringColors.length );
    gridColors[i][j] = coloringColors[colorIndex];
    counts[colorIndex] += 1;
   }
  }
 }

 /** getSize method
 * @return length of gridColors
 */
 public int getSize( )
 {
  return gridColors.length;
 }

 /** getNumberOfColors method
 * @return length of coloringColors
 */
 public int getNumberOfColors( )
 {
  return coloringColors.length;
 }

 /** getGridColor method
 * @param row, an int, the row index
 * @param col, an int, the column index
 * @return gridColor[row][col]
 */
 public Color getGridColor( int row, int col )
 {
  return gridColors[row][col];
 }

 /** highestCount method
 * @return the highest color frequency in the grid
 */
 public int highestCount( )
 {
  int max = counts[0];
  for ( int i = 1; i < counts.length; i++ )
  {
   if ( counts[i] > max )
    max = counts[i];
  }
  return max;
 }

 /** isCorrect method
 * @param index, an int
 * @return true if the frequency of the color for index
 * is the highest, false otherwise
 */
 public boolean isCorrect( int index )
 {
  return counts[index] == highestCount( );
 }

 /** getTitle method
 * @return a String representing a title for this object
 */
 public String getTitle( )
 {
  return "What is the most frequent color?";
 }

 /** getLabel method
 * @param index, an int
 * @return labels[index]
 */
 public String getLabel( int index )
 {
  return labels[index];
 }

 /** getIndex method
 * @param label, a String
 * @return index of label in labels
 */
 public int getIndex( String label )
 {
  for ( int i = 0; i < labels.length; i++ )
  {
   if ( labels[i].equals( label ) )
    return i;
  }
  return -1;
 }
}