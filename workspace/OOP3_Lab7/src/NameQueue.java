import java.util.*;
/** demonstrates a linked list and a queue of Strings
 */
public class NameQueue {
	public static void main (String args[]){
		// Create a LinkedList of Strings to model a queue
  		LinkedList<String> nameQueue = new LinkedList<String>();
  		// Add some names to it, adding each one at the head of the queue
    	nameQueue.addFirst("Bernadine");
  		nameQueue.addFirst("Elizabeth");
  		nameQueue.addFirst("Gene");
  		nameQueue.addFirst("Elizabeth");
  		nameQueue.addFirst("Clara");
  		
  		System.out.println("the first and last names are: "+nameQueue.getFirst()+" and "+nameQueue.getLast());
  		// display them in order: note the last one is at the top
  		System.out.println("People in the QL \n" + nameQueue);
  		// remove the last two
  		nameQueue.removeLast();
    	nameQueue.removeLast();
    	// display them again
    	System.out.println("\nLast two leave: \nPeople left in the Q: " +nameQueue);
    	// process the person at the top of the Q
    	System.out.println("\nServing the first person, who is " + nameQueue.poll());
    	System.out.println("People still in the Q: " +nameQueue);
    	nameQueue.add("Jason");
    	nameQueue.add("Alison");
    	System.out.println("the person on the top was "+nameQueue.poll());
    	System.out.println("now the q is "+nameQueue);
    	
    	
	}
}