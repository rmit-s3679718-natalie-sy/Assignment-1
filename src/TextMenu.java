
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
/**
 * It sets the menu text as an array of String	
 * @param menuText
 */
	public TextMenu(String[] menuText) {
		this.menuText = menuText;
		
	}
/**
 * This method displays the menu, then let user input selection.  If the choice entered is outside
 * the valid range, the default value is returned.
 * @return
 */
	public int getMenuSelection() {
		Scanner input = new Scanner(System.in);
		
		showMenu();
		choice = input.nextInt();
		if(choice < DEFAULT || menuText.length < choice) {
			System.out.println("Your choice was invalid - using default");
		}
		return choice;
	}
	
/**
 * This method displays the choices available in the menu
 */
	public void showMenu() {
		System.out.println("======================================");
		System.out.println("MiniNet Menu");
		System.out.println("======================================");
		for (int i=0; i < menuText.length; i++)
			System.out.println((i+1) + "." + menuText[i]);
		System.out.print(">");
	}

}
