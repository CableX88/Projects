/** Winners of Free DVD Rentals
*   Anderson, Franceschi
*/

import java.util.Random;

public class DVDWinners
{
  // array to hold winning member numbers chosen at random
  private int [ ] winners;
  // parallel array that holds prizes
  private String [ ] prizes = { "3 free rentals!",
                                "2 free rentals!",
                                "1 free rental!",
                                "free popcorn!",
                                "a free box of candy!" };
  /** Default constructor instantiates winners array
  *    and randomly generates winning member IDs
  */
  public DVDWinners( )
  {
    winners  = new int [prizes.length];
    fillWinners( ); // generate winner member IDs
  }

  /** Utility method generates winner member IDs
  *     and stores them in the winners array
  */
  private void fillWinners( )
  {
	 Random rand = new Random( );
    for ( int i = 0; i < winners.length; i++ )
    {
       winners[i] = rand.nextInt( 5000 ) + 1;
    }
  }

  /** Calls indexOfWinner with the member number
  *   then translates return value into the prize won
  *   @param memberNumber value to find
  *   @return prize
  */
  public String getPrize( int memberNumber )
  {
    int prizeIndex = indexOfWinner( memberNumber );
    if ( prizeIndex == -1 )
	  return "Sorry, member is not a winner.";
    else
      return "You win " + prizes[prizeIndex];
  }

  /** Performs sequential search of winners array
  *   @param key   member ID to find in winners array
  *   @return      index of key if found, -1 if not found
  */
  private int indexOfWinner( int key )
  {
    for ( int i = 0; i < winners.length; i++ )
    {
      if ( winners[i] == key )
	     return i;
    }
    return -1;
  }

  /** Returns printable version of DVDWinners object
  *   @return      winning numbers separated by a tab
  */
  public String toString( )
  {
    String returnValue = "";
    for ( int i = 0; i < winners.length; i++ )
    {
      returnValue += winners[i] + "\t";
    }
    return returnValue;
  }
}
