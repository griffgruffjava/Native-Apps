import java.util.*;
/** traverses a list in reverse using a ListIterator */
public class ReversedFriendsList {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;

        //Add members to a list
        friends = new LinkedList<Person>( );

        person = new Person("Emma", 10, 'F');
        friends.add( person );

        person = new Person("Jane",  6, 'M');
        friends.add( person );

        person = new Person("John",  8, 'F');
        friends.add( person );

        person = new Person("William", 14, 'M');
        friends.add( person );

        //display the names of all friends, ordered as entered
        System.out.println("\nNames of my friends:");
        Iterator<Person> it = friends.iterator();
		while (it.hasNext())
			System.out.println(it.next().getName());
			
		// display the list in reverse, by using a ListIterator
		System.out.println("\nNames of my friends, in reverse");
		ListIterator <Person> it2 = friends.listIterator(friends.size());
		while (it2.hasPrevious())
			System.out.println(it2.previous().getName());
		System.out.println("\nNames of my friends, forward again:");
		ListIterator <Person> it3 = friends.listIterator();
		while(it3.hasNext())
			System.out.println(it3.next().getName());
		
	    }
    
    
}






