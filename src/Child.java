
public class Child extends User{

	String parent1;
	String parent2;
	
	public Child (String userName, String image, String userStatus, int userAge, String parent1, String parent2) {
		super(userName, image, userStatus, userAge);
		this.parent1 = parent1;
		this.parent2 = parent2;
	}
	
	

}
