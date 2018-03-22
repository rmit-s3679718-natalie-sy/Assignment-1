import java.util.*;

public class User {
	
	private String userName;
	private String userImage;
	private String userStatus;
	private int userAge;
	//public ArrayList<String> list = new ArrayList<String>();
	public ArrayList<String> friendlist = new ArrayList<String>();
	
	// constructor
	public User(String userName, String image, String userStatus, int userAge) {
		this.userName = userName;
		this.userImage = userImage;
		this.userStatus = userStatus;
		this.userAge = userAge;
	}
	
	// accessors
	public String getUserName() 
	{ 
		return userName; 
	}
	
	public String getUserImage() 
	{ 
		return userImage; 
	}
	
	public String getUserStatus() 
	{ 
		return userStatus; 
	}
	
	public int getUserAge() 
	{ 
		return userAge; 
	}
	
	// setters
	public void setUserName(String UserName) 
	{ 
		userName = UserName; 
	}
	
	public void setUserImage(String UserImage) 
	{ 
		userImage = UserImage; 
	}
	
	public void setUserStatus(String UserStatus) 
	{ 
		userStatus = UserStatus; 
	}
	
	public void setUserAge(int UserAge) 
	{ 
		userAge = UserAge; 
	}
	
	// implementation in user class
	// add friend - adult and child 
	public void addFriend()
	{
		
		//friendList fList = new friendList();
		Scanner input = new Scanner (System.in);
		System.out.printf("What's the friend Name: ");
        String friendName = input.next();
        //friendlist.add("Bob"); // adds the friend to the array list
        //System.out.println("new size: " + friendlist.size() );
		
        //for ( int j=0; j<friendlist.size(); j++ )
          //  System.out.println("element " + j + ": " + friendlist.get(j) );
	}
	
	// delete friend 
	/*
	public void removeFriend()
	{
		Scanner input = new Scanner (System.in);
		System.out.printf("What's the friend Name: ");
        String friendName = input.next();
        friendlist.remove("Bob"); // adds the friend to the array list
        System.out.println("new size: " + friendlist.size() );
		
        for ( int j=0; j<friendlist.size(); j++ )
            System.out.println("element " + j + ": " + friendlist.get(j) );
		
	}
	*/
	
	// print profile
	// 
//	public String toString()
	// {
	 //  return String.format( "Name: %s\nStudent Last Name: %s\nStudent Age: %s\nStudent", firstName, lastName, age);
	 //}//end toString()
		
}
