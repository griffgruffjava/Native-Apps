import java.util.*;
/** demonstrates ArrayList of names. The same code will work for a LinkedList.
 */
public class NameList {
  public static void main (String args[]){
  	// create an ArrayList of strings
  	List<String> names = new ArrayList<String>();
  	// add some names to it
  	names.add("Bernadine");
  	names.add("Elizabeth");
  	names.add("Gene");
  	names.add("Elizabeth");
  	names.add("Clara");
  	// display the whole lot
  	System.out.println(names);
  	// Display the name in position 2
  	System.out.println("2: " + names.get(2));
  	
  	Set<String> nameTreeSet= new TreeSet<String>(names);
  	System.out.println(nameTreeSet);
  	
  	System.out.println("Printing the first and last of each set:");
  	System.out.println("Arraylist: "+names.get(0)+" and "+names.get(names.size()-1));
  	System.out.println("TreeSet: "+((TreeSet) nameTreeSet).first()+" and "+((TreeSet)nameTreeSet).last());
  }
}