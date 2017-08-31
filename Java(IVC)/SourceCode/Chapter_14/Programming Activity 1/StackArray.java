/* StackArray
*  Anderson, Franceschi
*/

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class StackArray
{
 public static final int CAPACITY = 10;

 private int [] stack;
 private int top;

 public StackArray( )
 {
  stack = new int[CAPACITY];
  top = -1;
 }

 public int get( int index )
 {
  return stack[index];
 }

 public int getTop( )
 {
  return top;
 }

 /** push method
 *   @param    value  value to be pushed onto the stack
 *   @return   true if successful, false if unsuccessful
 */
 public boolean push( int value )
 {
    // ***** 1. Student code starts here *****
    // stack is an int array instance variable representing
    // the array that stores our stack

    // top is an instance variable representing
    // the index of the top of the stack

    // CAPACITY is a constant instance variable representing
    // the size of the array stack

    // The push method adds the argument value
    // to the top of the stack, if it is possible
    // code the push method here


    return true;  // replace this dummy return statement
    // end of student code, part 1
 }

 /** pop method
 *   @return   the value of the top element of the stack, if
 *             successful
 */
 public int pop( ) throws DataStructureException
 {
    // ***** 2. Student code restarts here *****
    // stack is an int array instance variable representing
    // the array that stores our stack

    // top is an instance variable representing
    // the index of the top of the stack

    // CAPACITY is a constant instance variable representing
    // the size of the array stack

    // The pop method deletes the element
    // at the top of the stack, if it is possible
    // Code the pop method here



    return 0;  // replace this dummy return statement
    // end of student code, part 2
 }
}
