import java.util.*;

/**
 * This class represents a User.  It contains constructor, accessors, setters, add friend method and remove friend method
 * @version 1 	28 Mar 2018
 * @author 		Natalie Sy 
 *
 */
public class User {

	private String userName; //Name of user
	private String userImage; //Image of user
	private String userStatus; //Status of user
	private int userAge; //Age of user
	public ArrayList<String> userFriends = new ArrayList<String>(); //Arraylist to store user friends

	// constructor
	public User(String userName, String image, String userStatus, int userAge) {
		this.userName = userName;
		this.userImage = image;
		this.userStatus = userStatus;
		this.userAge = userAge;
	}

	// accessors
	public String getUserName() {
		return userName;
	}

	public String getUserImage() {
		return userImage;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public int getUserAge() {
		return userAge;
	}

	public ArrayList<String> getUserFriends() {
		return userFriends;
	}
	
	// setters
	public void setUserName(String UserName) {
		userName = UserName;
	}

	public void setUserImage(String UserImage) {
		userImage = UserImage;
	}

	public void setUserStatus(String UserStatus) {
		userStatus = UserStatus;
	}

	public void setUserAge(int UserAge) {
		userAge = UserAge;
	}
	
	/**
	 * This method adds friend to user profile
	 * @param userName
	 */
	public void addFriend(String userName) {
		userFriends.add(userName);
	}
	
	/**
	 * This method removes friend from user profile
	 * @param userName
	 */
	public void removeFriend(String userName) {
		userFriends.remove(userName);
	}

	
}
