
public class Adult extends User {

	public Adult (String userName, String image, String userStatus, int userAge, String child) {
		//subclass
		super(userName, image, userStatus, userAge);
		child = child;
	}

}
