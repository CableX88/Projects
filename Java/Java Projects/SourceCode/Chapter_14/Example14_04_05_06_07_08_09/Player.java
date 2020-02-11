/* The Player Class
   Anderson, Franceschi
*/

public class Player
{
 private int id;
 private String name;
 private String game;

 /** constructor
 * @param i   id
 * @param n  name
 * @param g  game
 */
 public Player( int i, String n, String g )
 {
    id = i;
    name = n;
    game = g;
 }

 /** accessor for id
 * @return   id
 */
 public int getID( )
 {
    return id;
 }

 /** accessor for name
 * @return name
 */
 public String getName( )
 {
    return name;
 }

 /** accessor for game
 * @return game
 */
 public String getGame( )
 {
    return game;
 }

 /** mutator for Id
 * @param i  new value for id
 */
 public void setID( int i )
 {
   id = i;
 }

 /** mutator for name
 * @param n  new value for name
 */
 public void setName( String n )
 {
    name = n;
 }

 /** mutator for game
 * @param g  new value for game
 */
 public void setGame( String g )
 {
    game = g;
 }

 /** equals method
 *  @param p reference to object to compare to this
 *  @return  true of p is Player object
 *   and all instance variables equal this; false otherwise
 */
 public boolean equals(  Object p )
 {
   if (  ! ( p instanceof  Player ) )
       return false;
   else
   {
       Player  objPlayer = ( Player ) p;
       return ( id == objPlayer.id && name.equals( objPlayer.name )
              && game.equals( objPlayer.game ) );
   }
 }

 /** toString method
 *  @return  String representation of Player object
 */
 public String toString( )
 {
    return ( "id: " + id + "\tname: "
             + name + "\tgame: " + game );
 }
}