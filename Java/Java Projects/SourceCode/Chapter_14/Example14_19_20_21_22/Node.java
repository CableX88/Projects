/** The Node class
*   Anderson, Franceschi
*/

public class Node<T>
{
  private T data;
  private Node<T> next;

  /** default constructor
  *  sets data and next to null
  */
  public Node( )
  {
    data = null;
    next = null;
  }

  /**  constructor
  *   @param item reference to data item
  *  sets next to null
  */
  public Node( T item )
  {
    setData( item );
    next = null;
  }

  /**  accessor for data
  *   @return reference to data item
  */
  public T getData( )
  {
    return data;
  }

  /**  accessor for next
  *   @return next
  */
  public Node<T> getNext( )
  {
    return next;
  }

  /**  mutator for data
  *   @param reference to data item
  */
  public void setData( T item )
  {
    data = item;
  }

  /**  mutator for next
  *   @param reference to next Node
  */
  public void setNext( Node<T> nd )
  {
    next = nd;
  }
}
