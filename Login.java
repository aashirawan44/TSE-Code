/**
 * The Login class represents the functionality related to user login in the course registration system.
 * It extends the User class and provides methods to gather user information such as first name, last name,
 * username, and password for authentication purposes.
 */

package crs;
import java.util.Scanner;

public class Login extends User{
	public static void askUser() {
		
	}
	
	
	@Override
	public void firstName() {
		Scanner input = new Scanner(System.in);
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		
	}

	@Override
	public void lastName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
	}

	@Override
	public void username() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String username = input.nextLine();
	}

	@Override
	public void password() {
		Scanner input = new Scanner(System.in);
		System.out.print("Password: ");
		String password = input.nextLine();
	}

	
	
	
	
	

	
}
