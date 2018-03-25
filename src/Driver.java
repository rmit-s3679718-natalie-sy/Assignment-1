import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public final static int ADDUSER = 1;
	public final static int FINDUSER = 2;
	public final static int LISTUSER = 3;
	public final static int DELETEUSER = 4;
	public final static int ADDFRIENDS = 5;
	public final static int DELETEFRIENDS = 6;
	public final static int QUIT = 7;
	public final static int MAX_USERS = 50;

	// private UserDatabase userDatabase;
	ArrayList<User> users = new ArrayList<User>();

	public Driver() {
		initialiseUsers();
	}

	public void initialiseUsers() {
		User Nat = new User("Natalie", "image1", "status1", 20);
		User Alice = new User("Alice", "image2", "status2", 22);
		User Bob = new User("Bob", "image3", "status3", 30);
		User Don = new User("Don", "image4", "status4", 30);

		users.add(Nat);
		users.add(Bob);
		users.add(Don);
		users.add(Alice);
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.runDriver();
	}
	
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
	
	public void listAll() {
		System.out.println("list of users: ");
		for( int index=0; index<users.size(); index++)
			System.out.println(users.get(index).getUserName());
	}
	
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
	
	public boolean isFriends(User user1, User user2) {
		for( int i=0; i<user1.getUserFriends().size(); i++) {
			if (user1.getUserFriends().get(i).equals(user2.getUserName()))
				return true;
		}
		return false;
	}
	
	public User getUser(String name) {
		for( int index=0; index<users.size(); index++)
			if(users.get(index).getUserName().equals(name))
				return users.get(index);
		return null;
	}
	
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
			System.out.println("They not friends anymore.");
		}	
	}
	
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
