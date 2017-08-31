/* The PlayerNode class
   Anderson, Franceschi
*/

public class PlayerNode
{
  private Player player;
  private PlayerNode next;
  /** default constructor
  *  initializes player and next references to null
  */
  public PlayerNode( )
  {
    player = null;
    next = null;
  }

  /**  overloaded constructor
  *  @param  p
  *  initializes player reference to p
  */
  public PlayerNode( Player p )
  {
    setPlayer( p );
    next = null;
  }

  /**  accessor for player
  *  @return player
  */
  public Player getPlayer( )
  {
    return player;
  }

  /**  accessor for next
  *  @return next
  */
  public PlayerNode getNext( )
  {
    return next;
  }

  /**  mutator for player
  *  @param p  new Player reference
  */
  public void setPlayer( Player p )
  {
    player = p;
  }

  /**  mutator for next
  *  @param pn reference to new PlayerNode
  */
  public void setNext( PlayerNode pn )
  {
    next = pn;
  }
}
