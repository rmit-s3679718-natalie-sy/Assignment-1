
import java.util.ArrayList;

public class UserDatabase {
	 private User users[]; // array of Accounts

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
}

