
public class Driver {
	
	public Driver() {
	}

	
	public int chooseTransaction() {
		System.out.println("\n    MiniNet Menu");
		System.out.println("\n    ========================================");
		String[] options = {"Add a person", "Select a person", "Exit"}; 
		
		for (int i=0; i < options.length; i++)
			System.out.printf(" %3d : %s\n", i+1, options[i]);
		
		int choice = 0;
//		while (choice < 1 || choice > options.length)
//			choice = validateChoiceInt("Enter Choice: ", 1, options.length);
		return choice;
	}
	
	public static void main(String[] args) {
		Driver run = new Driver();
		run.chooseTransaction();
		
	}
	
	  
}
