/**
 * This subclass Child is an extension of the super class User class
 * @version 1 	28 Mar 2018
 * @author 		Natalie Sy 
 *
 */

public class Child extends User{

	String parent1;
	String parent2;
	
	public Child (String userName, String image, String userStatus, int userAge, String parent1, String parent2) {
		super(userName, image, userStatus, userAge);
		this.parent1 = parent1;
		this.parent2 = parent2;
	}
	
	

}
