import java.util.ArrayList;

public class TestUser {

	public static void addFriends(User user1, User user2) {
		if ( !isFriends(user1, user2) ) {
			user1.addFriend(user2.getUserName());
			user2.addFriend(user1.getUserName());
			System.out.println("They are now friends.");
		} else 
			System.out.println("They are already friends.");
	}
	
	public static void deleteFriends(User user1, User user2) {
		if ( !isFriends(user1, user2) ) { 
			System.out.println("They are never friends.");
		} else {
			user1.removeFriend(user2.getUserName());
			user2.removeFriend(user1.getUserName());
			System.out.println("They not friends anymore.");
		}	
	}
	
	public static boolean isFriends(User user1, User user2) {
		for( int i=0; i<user1.getUserFriends().size(); i++) {
			if (user1.getUserFriends().get(i).equals(user2.getUserName()))
				return true;
		}
		return false;
	}
	
	public static void printFriends(User user) {
		System.out.println(user.getUserName() + " list of friends: ");
		for( int i=0; i<user.getUserFriends().size(); i++)
			System.out.println(user.getUserFriends().get(i));
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		User Nat = new User("Natalie", "image1", "status1", 20);
		User Alice = new User("Alice", "image2", "status2", 22);
		User Bob = new User("Bob", "image3", "status3", 30);
		User Don = new User("Don", "image4", "status4", 30);
		
		users.add(Nat);
		users.add(Bob);
		users.add(Don);
		users.add(Alice);

		System.out.println("NAT");
		addFriends(Nat, Alice);
		addFriends(Nat, Bob);
		addFriends(Nat, Don);	
		printFriends(Nat);		
		
		System.out.println("BOBS");
		addFriends(Bob, Nat);
		addFriends(Bob, Alice);
		
		System.out.println("ALICE");
		addFriends(Alice, Bob);
		addFriends(Alice, Don);
			
	}
}
