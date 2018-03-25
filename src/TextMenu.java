
import java.util.Scanner;

/**
 * This class contains get menu selection and display menu methods
 * @version 1 	28 Mar 2018
 * @author 		Natalie Sy 
 *
 */

public class TextMenu {

		public final static int DEFAULT = 1;
		private int choice;
		private String[] menuText;
	
	public TextMenu(String[] menuText) {
		this.menuText = menuText;
		
	}
	
	public int getMenuSelection() {
		Scanner input = new Scanner(System.in);
		
		displayMenu();
		choice = input.nextInt();
		if(choice < DEFAULT || menuText.length < choice) {
			System.out.println("Your choice was invalid - using default");
		}
		return choice;
	}
	
	public void displayMenu() {
		System.out.println("MiniNet Menu");
		System.out.println("======================================");
		for (int i=0; i < menuText.length; i++)
			System.out.println((i+1) + "." + menuText[i]);
		System.out.print(">");
	}

}
