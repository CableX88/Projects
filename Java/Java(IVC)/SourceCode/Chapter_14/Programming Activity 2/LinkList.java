/* LinkList
*  Anderson, Franceschi
*/

/**
 * this class is a concrete implementation of the AbstractList.
 *
 * properties of this implementation are such that:
 *   - the list is singly linked
 *   - data contained in the nodes is limited to integers
 *   - nodes are sorted in ascending order of data
 *   - duplicate data is allowed
 *      -  note that duplicate data may cause inconsistent behavior
 *         in the Visualizer because the delete method searches for the
 *         first instance of data.  if a node besides the first one is
 *         highlighted, the first one will still be deleted.
 */

public class LinkList extends AbstractList
{
  private Node head = null;

  public LinkList( )
  {
    super( 500,400 );
    v.drawList( head );
  }

  public LinkList( Node head )
  {
    super( 500, 400 ); // set size for visualizer
    // set up the list
    head = head;

    animate( head );
  }

 public void insert( int i )
 {
    // ***** Student writes the body of this method *****

    // code the insert method of a linked list of ints
    // the int to insert in the linked list is i

    // we call the animate method inside the body of this method
    // as you traverse the list looking for the place to insert,
    // call animate as follows:

    //    animate( head, current );
    // where    head is the instance variable head of the linked list
    //          current is the node that you are visiting

    // you can start coding now

    // in order to improve the animation (this is optional):
    // just before inserting, i.e. connecting the nodes,
    // make the call

    //    animate( head, previous, Visualizer.ACTION_INSERT_AFTER );

    // where    head is the instance variable head of the linked list
    //          previous is the node (not null) after which to insert

    // if you are inserting at the beginning of the list,
    // just before inserting, make the call

    //    animate( head, head, Visualizer.ACTION_INSERT_BEFORE );

    // where    head is the instance variable head of the linked list

    //
    // Student code starts here
    //




    //
    // End of student code, part 1
    //

    // call animate again to show the status of the list
    animate( head );
  }

  public boolean delete( int i )
  {
    // ***** Student writes the body of this method *****

    // code the delete method of a linked list of ints
    // the int to delete in the linked list is i
    // if deletion is successful, return true
    // otherwise, return false

    // we call the animate method inside the body of this method
    // as you traverse the list looking for the node to delete,
    // call animate as follows:

    //    animate( head, current );

    // where    head is the instance variable head of the linked list
    //          current is the node that you are visiting

    // you can start coding now

    // in order to improve the animation (this is optional):
    // just before deleting, i.e. connecting the nodes,
    // make the call

    //    animate( head, current, Visualizer.ACTION_DELETE );

    // where    head is the instance variable head of the linked list
    //          current is the node that you are deleting

    //
    // Student code starts here
    //



    // call animate again to show the status of the list
    // if returning true
    animate( head ); //  draw the list

    return true;  //  replace this return statement
    //
    // End of student code, part 2
    //
  }

  public int count( )
  {
    int n = 0;
    Node current = head;
    while( current != null )
    {
      animate( head, current );
      n++;
      current = current.getNext( );
    }
    return n;
  }

  public void traverse( )
  {
    traversal = "";
    Node current = head;
    while( current != null )
    {
      animate( head, current );
      traversal += ( current.getData( ) + "  " );
      current = current.getNext( );
    }
    v.drawList( head );
  }

  public void clear( )
  {
    head = null;
    v.drawList( head );
  }

  public void animate( Node h, Node nd )
  {
    v.drawList( h, nd );
    delay( 1000 );
  }

  public void animate( Node h )
  {
    v.drawList( h );
  }

  public void animate( Node h, Node nd, int mode )
  {
    v.drawList( h, nd, mode );
    delay( 1000 );
  }
}