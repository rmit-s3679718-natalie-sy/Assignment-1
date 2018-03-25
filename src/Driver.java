import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a Driver.  It displays a simple menu system.  It contains the following methods:
 * main, initialise users, add users, find users, list user profiles, delete user, is friend, get user, 
 * add friends, delete friends and run driver.
 * @version 1 	28 Mar 2018
 * @author 		Natalie Sy 
 *
 */
public class Driver {

	public final static int ADDUSER = 1; //add a user 
	public final static int FINDUSER = 2; //search if user exists in the record
	public final static int LISTUSER = 3; //display all user profiles
	public final static int DELETEUSER = 4; //delete a user
	public final static int ADDFRIENDS = 5; //add connection between two users as friends 
	public final static int DELETEFRIENDS = 6; //delete connection between two users as friends
	public final static int QUIT = 7; //exit program
	

	ArrayList<User> users = new ArrayList<User>();

	public Driver() {
		initialiseUsers();
	}
/**
 * This method is to initialize users
 */
	public void initialiseUsers() {
		User Alice = new User("Alice", "alice.jpg", "working", 20);
		User Bob = new User("Bob", "bob.jpg", "retired", 67);
		User Cathy = new User("Cathy", "cathy.jpg", "studying", 18);
		User Don = new User("Don", "don.jpg", "part-time job", 27);

		users.add(Alice);
		users.add(Bob);
		users.add(Cathy);
		users.add(Don);
	}
/**
 * This is the main method
 * @param args
 */
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.runDriver();
	}
	
/**
 * This method is used to add new user by entering name, image, status and age
 */
	public void addNewUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.print('\n' + "Enter name:");
		String name = input.nextLine();
		System.out.print('\n' + "Enter image:");
		String image = input.nextLine();
		System.out.print('\n' + "Enter status:");
		String status = input.nextLine();
		System.out.print('\n' + "Enter age:");
		int age = input.nextInt();
		
		User user = new User(name, image, status, age);
		users.add(user);
	}

/**
 * This method is used to find a user in the list
 */
	public void findUser() {
		Scanner input = new Scanner(System.in);
		boolean found = false;
		
		System.out.print('\n' + "Enter name:");
		String name = input.nextLine();
		
		for(int index=0; index<users.size(); index++) {
			if(users.get(index).getUserName().equals(name)) {
				System.out.println("Found");
				found = true;
			}
		}
		
		if (!found)
			System.out.println("Not Found");
	}

/**
* This method is used to display name, image, status, age and friends of all users
*/
	public void listAll() {
		System.out.println("list of users: ");
		for( int index=0; index<users.size(); index++)
			System.out.println("NAME: " + users.get(index).getUserName() + " " + "IMAGE: "+ users.get(index).getUserImage() + " " + "STATUS: " + users.get(index).getUserStatus() + " " + "AGE: " + users.get(index).getUserAge() + " " + "FRIENDS: " + users.get(index).userFriends);
	}

/**
* This method is used to delete users
*/
	public void deleteUser() {
		Scanner input = new Scanner(System.in);
		boolean found = false;
		
		System.out.print('\n' + "Enter name:");
		String name = input.nextLine();
		
		for( int index=0; index<users.size(); index++) {
			if(users.get(index).getUserName().equals(name)) {
				found = true;
				users.remove(index);
			}
				
		} 
		
		if (!found)
			System.out.println("Not found");
	}
	
/**
 * This method is used to check if the person is friend of the user.  
 * @param user1
 * @param user2
 * @return
 */
	public boolean isFriends(User user1, User user2) {
		for( int i=0; i<user1.getUserFriends().size(); i++) {
			if (user1.getUserFriends().get(i).equals(user2.getUserName()))
				return true;
		}
		return false;
	}

/**
 * This method is used to get list of users
 * @param name
 * @return
 */
	public User getUser(String name) {
		for( int index=0; index<users.size(); index++)
			if(users.get(index).getUserName().equals(name))
				return users.get(index);
		return null;
	}

/**
 * This method is used connect two users to be friends
 */
	public void addFriends() {
		Scanner input = new Scanner(System.in);
		User user1 = null, user2 = null;
		
		System.out.print('\n' + "Enter name 1:");
		String name1 = input.nextLine();
		if (getUser(name1) == null) 
			System.out.println("no such user.");
		else 
			user1 = getUser(name1);
		
		System.out.print('\n' + "Enter name 2:");
		String name2 = input.nextLine();
			user2 = getUser(name2);
		
		if ( !isFriends(user1, user2) && (user1 != null) && (user2 != null)  ) {
			user1.addFriend(user2.getUserName());
			user2.addFriend(user1.getUserName());
			System.out.println("They are now friends.");
		} else 
			System.out.println("They are already friends.");
	}

/**
 * This method is used to delete friend connection between two users 
 */
	public void deleteFriends() {
		Scanner input = new Scanner(System.in);
		
		System.out.print('\n' + "Enter name 1:");
		String name1 = input.nextLine();
		User user1 = getUser(name1);
		
		System.out.print('\n' + "Enter name 2:");
		String name2 = input.nextLine();
		User user2 = getUser(name2);
		
		if ( !isFriends(user1, user2) ) { 
			System.out.println("They are never friends.");
		} else {
			user1.removeFriend(user2.getUserName());
			user2.removeFriend(user1.getUserName());
			System.out.println("They are not friends anymore.");
		}	
	}

/**
 * This method is to display the Mininet menu with the options to add user, find user, list users, delete user, add friends,
 * remove friends and quit
 */
	public void runDriver() {
		boolean more = true;
		int option;

		String[] options = { "Add User", "Find user", "List users", "Delete User", "Add Friends", "Remove Friends", "Quit" };
		TextMenu myMenu = new TextMenu(options);

		while (more) {
			option = myMenu.getMenuSelection();

			switch (option) {
				case ADDUSER: {
					addNewUser();
					break;
				}
				case FINDUSER: {
					findUser();
					break;
				}
				case LISTUSER: {
					listAll();
					break;
				}
				case DELETEUSER: {
					deleteUser();
					break;
				}
				case ADDFRIENDS: {
					addFriends();
					break;
				}
				case DELETEFRIENDS: {
					deleteFriends();
					break;
				}
				case QUIT: {
					more = false;
					System.out.println("exited social network.");
					break;
				}
			}
		}
	}
		


}
