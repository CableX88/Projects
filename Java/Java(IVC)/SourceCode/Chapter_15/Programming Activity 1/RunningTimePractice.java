/* Chapter 15 Programming Activity 1
*  RunningTime.java
*  Anderson, Franceschi
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class RunningTimePractice extends JFrame
{
   private int size = 15;

   private static RunningTimePractice app;
   private static int [] arr;
   private static int current1 = -1;
   private static int current2 = -1;

   private BarChart bc;

   private JButton selectionSort;
   private ButtonHandler bh;

   private Image offscreen;

   public RunningTimePractice( )
   {
      super( "Evaluating Selection Sort" );
      Container c = getContentPane( );
      c.setLayout( new FlowLayout( ) );


      selectionSort = new JButton( "Start Selection Sort" );
      c.add( selectionSort );

      bh = new ButtonHandler( );

      selectionSort.addActionListener( bh );

      setupActivity( );

      arr = new int[size];

      Random rand = new Random( );
      // fill with random numbers between 20 and 160
      for ( int i = 0; i < arr.length; i++ )
      {
          arr[i] =  rand.nextInt( 80 ) + 20;
      }

      bc = new BarChart( arr );

      setSize( BarChart.XMAX ,BarChart.YMAX );
      setVisible( true );
      offscreen = this.createImage( getSize( ).width, getSize( ).height );
   }

   //  1. *****  student writes this method
   /**  Sorts arr in ascending order using the selection sort algorithm
   *    Adds a counter to count the number of iterations
   */
   public int selectionSort( )
   {
    // To count the number of iterations, use a counter
    // The variable counter has been declared and initialized for you
    // at the beginning of this method
    // Inside the body of the inner loop, increment the counter
    // Replace the return statement so that this method returns the value of the counter
    // To slow down or accelerate the animation, modify the argument of Pause.wait in the animate method

    int counter = 0;
    int temp, indexOfMax;

    for ( int i = 0; i < arr.length - 1; i++ )
    {
 	    // find index of largest value in the subarray
       indexOfMax = 0;
	    animate( i, 0, counter );
       for ( int j = 1; j < arr.length - i; j++ )
       {
		    if ( arr[j] > arr[indexOfMax] )
			   indexOfMax = j;

		    animate( i, j, counter);
       }
		  
	    // swap arr[indexOfMax] and arr[arr.length - i]
	    temp = arr[indexOfMax];
	    arr[indexOfMax] = arr[arr.length - i - 1];
	    arr[arr.length -i - 1] = temp;
    }
    animate( arr.length - 1, 0, counter );
    return 0;

   } // end of selectionSort

   public void setupActivity( )
   {
     boolean goodInput = false;
     String answer;

     while ( !goodInput || size < 5 || size > 25 )
     {
       try
       {
         answer = JOptionPane.showInputDialog( null,
              "Enter an integer value between 5 and 25 to set the number of elements in the array" );
         if ( answer != null )
         {
            size = Integer.parseInt( answer );
            goodInput = true;
         }
         else
         {
            goodInput = false;
            break;
         }
       }
       catch( Exception e )
       {}
     }
   }

   public void startActivity( )
   {
     int steps = selectionSort( );
     JOptionPane.showMessageDialog( null,
         "The sorting of the array is complete; you counted " + steps + " steps" );
     enableButton( );
   }

   public static int getCurrent1( )
   {
      return current1;
   }

   public static int getCurrent2( )
   {
      return current2;
   }

   public static int [] getArray( )
   {
      return arr;
   }

   public void disableButton( )
   {
      selectionSort.setEnabled ( false );
   }

   public void enableButton( )
   {
      selectionSort.setEnabled ( true );
   }

   private void animate( int index1, int index2, int intermedResult )
   {
     current1 = index1;
     current2 = index2;
     bc.setStudentResult( intermedResult );
     bc.setArray( arr );

     Graphics g = offscreen.getGraphics( );
     paint( g );
     g = this.getGraphics( );
     g.drawImage( offscreen, 0, 0, this );

     Pause.wait( 0.250 );
   }

   public void paint( Graphics g )
   {
      super.paint( g );
      bc.draw( g );
      bc.updateBarChart( g );
   }

   public static void main( String [] args )
   {
      app = new RunningTimePractice( );
      app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   private class ButtonHandler implements ActionListener
   {
      private boolean on = true;
      public void actionPerformed( ActionEvent e )
      {
        PrintArrayT t = new PrintArrayT( app );
        if ( e.getSource( ) == selectionSort )
        {
           disableButton( );
           selectionSort.requestFocus( );
           t.start( );
        }
      }
   }

   private class PrintArrayT extends Thread
   {
      int [] arr;
      RunningTimePractice s1;
      public PrintArrayT( RunningTimePractice s )
      {
         arr = RunningTimePractice.arr;
         s1 = s;
      }
      public void run( )
      {
        startActivity( );
      }
   }
}
