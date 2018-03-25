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

	/*
	 * // implementation in user class // add friend - adult and child public
	 * boolean addFriend(String friend) {
	 * 
	 * if (Friends.contains(friend)) { return false; } else { Friends.add(friend);
	 * return true; }
	 * 
	 * }
	 * 
	 * // delete friend
	 * 
	 * public boolean removeFriend(String friend) { if(Friends.contains(friend)){
	 * Friends.remove(friend); return true; }else { return false; } }
	 * 
	 * public Iterator<String> getFriends(){ return Friends.iterator(); }
	 * 
	 * public String toString() {
	 * 
	 * String sFriendsList = " "; boolean firstFriend = true; for(int i = 0; i <
	 * Friends.size(); i++){ if(firstFriend) { sFriendsList = sFriendsList + " " +
	 * Friends.get(i); firstFriend = false; }else{ sFriendsList = sFriendsList +
	 * ", " + Friends.get(i); } }
	 * 
	 * return ""+userName+ " "+userStatus+":" + sFriendsList + " "; }
	 */

}
