import java.util.*;

public class User {

	private String userName;
	private String userImage;
	private String userStatus;
	private int userAge;
	public ArrayList<String> userFriends = new ArrayList<String>();

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
	
	public void addFriend(String userName) {
		userFriends.add(userName);
	}
	
	public void removeFriend(String userName) {
		userFriends.remove(userName);
	}

	
}
