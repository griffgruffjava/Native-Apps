/**Models a person, with name, age and gender */
public class Person implements Comparable<Person>  {
	private String name;
	private int age;
	private char gender;
	
	public int getAge() { return age;}
	public char getGender() { return gender;}
	public String getName() { return name;}
	
	public void setAge (int age) {
				this.age = age;
	}
	
		public int compareTo(Person p){
	//	Person x =(Person)p;
		return this.getAge() - p.getAge();
		
		//if (this.getAge()<p.getAge()){return 1;}
		//else if (this.getAge()<p.getAge()){return 0;}
		//else {return -1;}
	}
	
	/** change the name
	 *@param name Full Name
	 */
	public void setName( String name) {
				this.name = name;
	}
	
	/** assign the gender
	 *@param g Gender: 'm' or 'f'
	 */
	public void setGender(char gender) {
				this.gender = gender;
	}
	
	/** default Persons have attributes "Name Not Given,", 0 and 'U'*/
	public Person() {
				this("Name Not Given",0,'U');
	}
	
	/** all attributes known
	 *@param name Full name
	 *@param age Age to the nearest year
	 *@param gender Gender 'm' or 'f'
	 */
	public Person(String name, int age, char gender) {
				setName(name);
				setAge(age);
				setGender(gender);
	}
	
	/** returns all attributes on one line, separated by spaces*/
	public String toString() {
				return getName() + " " + getAge() + " " + getGender();
	}
}