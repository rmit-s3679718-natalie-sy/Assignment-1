/**
 * This subclass Adult is an extension of the super class User class
 * @version 1 	28 Mar 2018
 * @author 		Natalie Sy 
 *
 */

public class Adult extends User {
	
	String child;
	
	public Adult (String userName, String image, String userStatus, int userAge, String child) {
		super(userName, image, userStatus, userAge);
		child = child;
	}

}
