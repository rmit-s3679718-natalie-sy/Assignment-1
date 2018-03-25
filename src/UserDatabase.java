
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
	 
	 
	 }

