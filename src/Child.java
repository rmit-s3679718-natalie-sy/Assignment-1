
public class Child extends User{

	public Child (String userName, String image, String userStatus, int userAge, String parent) {
		super(userName, image, userStatus, userAge);
		parent = parent;
	}

}
