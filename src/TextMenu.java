
import java.util.Scanner;

public class TextMenu {

		public final static int DEFAULT = 1;
		private int selection;
		private String[] menuText;
	
	public TextMenu(String[] menuText) {
		this.menuText = menuText;
		
	}
	
	public int getMenuSelection() {
		Scanner input = new Scanner(System.in);
		
		displayMenu();
		selection = input.nextInt();
		if(selection < DEFAULT || menuText.length < selection) {
			System.out.println("Your selection was invalid - using default");
		}
		return selection;
	}
	
	public void displayMenu() {
		System.out.println("\nEnter your selection: \n");
		for (int index=0; index < menuText.length; index++)
			System.out.println((index+1) + "." + menuText[index]);
		System.out.print(">");
	}

}
