
import java.util.ArrayList;

public class UserDatabase {
	 private int count; 
	 private User[] users; // array of Accounts

	 public UserDatabase(int maxLength) {
		  users = new User[maxLength];
	 }
	 
	 public int size() {
		 return count;
	 }
	 
	 public boolean add(User user) {
		 if (user ==null)
			 return false;
		 users[count++] = user;
		 return true;
	 }
	 
	 public User get(int index) {
		 if (users.length <= index)
			 return null;
		 return users[index];
	 }
	 
	 public int indexOf(String nameToFind) {
		 for (int index =0; index < users.length && users[index]!=null; index++) {
			 if(users[index].getUserName().equals(nameToFind))
				 return index;
		 }
		 return -1;
	 }
	 
	 
	 /*
	   // no-argument UserDatabase constructor initializes accounts
	   public UserDatabase()
	   {
	      users = new User[ 30 ]; 
	      users[ 0 ] = new User( "Alice", "alice.jpg", "Working", 35 );
	      users[ 1 ] = new User( "Bob", "bob.jpg", "Freelance", 28 );
	      users[ 2 ] = new User( "Cathy", "cathy.jpg", "looking for jobs", 24 );
	      users[ 3 ] = new User( "Don", "don.jpg", "student at RMIT", 18 );
	   } // end no-argument UserDatabase constructor

	   
	   public static void main(String[] args) {
		   ArrayList<String> Users = new ArrayList<String>();

		   Users.add("Alice");
		   Users.add("Bob");
		   System.out.println(Users.get(0));
		   System.out.println(Users.get(1));
		   
		   Users.remove("Alice");
		   System.out.println(Users.get(0));
		   
		   
	   }
	   */
}

