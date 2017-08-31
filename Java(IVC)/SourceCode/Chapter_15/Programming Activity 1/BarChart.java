/* Draws a Bar Chart
*  Anderson, Franceschi
*/

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

 public class BarChart
 {
  public static int XMAX = 400;
  public static int YMAX = 350;

  private int [] data;
  private int barSize;
  private int xStart;
  private int exactMaximum;
  private int studentResult;

  public BarChart( )
  {}

  public BarChart( int [] dArray )
  {
    data = new int [dArray.length];
    for ( int i = 0; i < dArray.length; i++ )
    {
        data[i] = dArray[i];
    }
    barSize = ( XMAX - 20 ) / data.length;
  }

  public void setArray( int [] dArray )
  {
    for ( int i = 0; i < dArray.length; i++ )
    {
        data[i] = dArray[i];
    }
  }

  public void setStudentResult( int newStudentResult )
  {
    studentResult = newStudentResult;
  }

  public void setExactMaximum( int em )
  {
    exactMaximum = em;
  }

  public void updateBarChart( Graphics g )
  {
    drawSelectionSort( g );
  }

  public void draw( Graphics g )
  {
    xStart = 10;
    g.setColor( Color.BLUE );
    for ( int i = 0; i < data.length; i++ )
    {
        g.fillRect( xStart, YMAX - 45 - data[i], barSize-5, data[i] );
        g.drawString( String.valueOf( data[i]), xStart, YMAX - 25 );
        xStart += barSize;
    }
  }

  public void drawSelectionSort( Graphics g )
  {
    int c = RunningTimePractice.getCurrent1( );
    int a = RunningTimePractice.getCurrent2( );
    int b = findCounterValue( c, a );
    int max = findMaximumValue( c, a ); ;

    if ( c != -1 )
    {
      g.setColor( Color.BLUE );
      g.drawString( "Your current counter value: " + studentResult, 25, 100 );
      int correctCounterValue = b;
      g.drawString( "Correct current counter value: " + correctCounterValue, 25, 120 );

      g.setColor( Color.RED );
      xStart = 10 + a * barSize;
      g.drawRect( xStart, YMAX - 45 - data[a], barSize-5, data[a] );
      xStart = 10;

      for ( int i = 0; i <= a; i++ )
      {
        if ( data[i] == max )
        {
          g.setColor( Color.RED );
          g.fillRect( xStart, YMAX - 45 - data[i], barSize-5, data[i] );
          g.drawString( String.valueOf(data[i]), xStart, YMAX - 25 );
          break;
        }
        xStart += barSize;
      }
    }
  }

  public int findCounterValue( int index1, int index2 )
  {
    int steps = 0;
    for ( int i = 0; i < index1; i++ )
    {
        for ( int j = 1; j < data.length - i; j++ )
	     	   steps++; 
    }

    for ( int j = 1; j <= index2; j++ )
	     steps++; 

    return steps;
  }

  public int findMaximumValue( int index1, int index2 )
  {
    int max = data[0];
    for ( int i = 0; i < index2; i++ )
    {
        if ( max < data[i] )
	     	max = data[i]; 
    }

    return max;
  }
}
