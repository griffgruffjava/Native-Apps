import java.util.*;
import javax.swing.*;
/** integrates Collections, Lists and Sets
 */
public class SubjectList {
	static JTextArea area;
	public static void main (String args[]){
		area = new JTextArea();
  		String[] proposedSubjects = {
 		"Linux News","PHP","Java","XML","Perl",
		 "Linux Development","PHP","XML","Web-Services",
 		"Linux Tools", "IT Management", "Security" ,
 		"Java", "J2EE", "XML" };

		// Creating a List from the previous Array
		// and placing it in the Collection Interface
		Collection<String> convertedSubjects = 
                             Arrays.asList(proposedSubjects);
        //Creating an ArrayList instance with the previous Collection
        List<String> osdnSubjects = new ArrayList<String>(convertedSubjects);
        area.setText("Initial list of subjects\n\n");
        display(osdnSubjects);
        JOptionPane.showMessageDialog(null,"We have " + 
             osdnSubjects.size()  + " subject proposals");
             
        // Creating a HashSet instance with the previous List to get rid of duplicates:
       Set<String> uniqueSubjects = new HashSet<String> (osdnSubjects);
	   area.setText("Set of subjects without the duplicates\n\n");
	   display(uniqueSubjects);

       // Counting the elements on the HashSet which would be 11
       JOptionPane.showMessageDialog(null,"We have " + 
        uniqueSubjects.size()  + " unique subject proposals");
        
       // Create a TreeSet instance with the initial List to get a sorted set
		SortedSet<String> sortedSubjects = 
                                   new TreeSet<String> (osdnSubjects);
        area.setText("Sorted set of subjects\n\n");
        display(sortedSubjects);
        
        // Check if no subjects have been mishandled from the start. 
        //The following statment should result true
		boolean alliswell = sortedSubjects.containsAll(osdnSubjects);

       // Show the result of the comparison
        JOptionPane.showMessageDialog(null,"Do we still have every subject from the start : "
        	                                 + alliswell);
      // Nicer version of previous line
      JOptionPane.showMessageDialog(null,"Do we still have every subject from the start : "
        	                                 + (alliswell?"Yes":"No"));



	}
	/** use an iterator to display a collection in a text area 
	 *@param c any collection
	 */
	public static void display(Collection c){
		Iterator iter = c.iterator();
        while (iter.hasNext())
        	area.append(iter.next() + "\n");
        JOptionPane.showMessageDialog(null,area);
	}

}