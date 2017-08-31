/* Accounting class
*  Anderson, Franceschi
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Accounting extends JFrame
{
 private BankAccount bankAccount;

 public Accounting( )
 {
   bankAccount = new BankAccount( getBackground( ) );
   setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   setSize( 300, 300 );
   setVisible( true );
 }

 public void balanceCheckBook( )
 {
    // ***** Write the body of this method *****
    //
    // Using a while loop, read the file transactions.txt
    // The file transactions.txt contains
    // transactions between you and your bank
    //
    //  You will need to call the animate method inside
    //  the body of the loop that reads the file contents
    //
    // The animate method takes three arguments:
    //    a String, representing the type of transaction
    //    a double, representing the transaction money amount
    //    a double, representing the new checkbook balance
    // So if these three variables are:
    //     transactionName, currentAmount, and balance,
    //  then the call to animate will be:
    //
    //  animate( transactionName, currentAmount, balance );
    //
    // You should make that call in the body of your while
    // loop, after you have updated the checkbook balance
    //



    //
    // end of student code
    //
 }

 public void animate( String currentTransaction, double currentAmount, double currentBalance )
 {
   // set the current transaction in the bankAccount object
   if ( currentTransaction.startsWith( "Ch" ) )
       bankAccount.setCurrentTransaction( new Check(currentAmount ) );
   else if ( currentTransaction.startsWith( "With" ) )
       bankAccount.setCurrentTransaction( new Withdrawal(currentAmount ) );
   else if ( currentTransaction.startsWith( "Dep" ) )
       bankAccount.setCurrentTransaction( new Deposit(currentAmount ) );
   else
       bankAccount.setCurrentTransaction( new UnknownTransaction(currentAmount ) );

   // set the currentBalance data member in the bankAccount object
   bankAccount.updateBalance( currentBalance );

   repaint( );
   try
   {
    Thread.sleep( 3000 );  // wait for the animation to finish
   }
   catch ( Exception e )
   {
   }
 }

 public void paint( Graphics g )
 {
   super.paint( g );
   bankAccount.draw( g );
 }

 public static void main( String [] args )
 {
   Accounting app = new Accounting( );
   app.balanceCheckBook( );
 }
}
