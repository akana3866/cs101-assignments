package HW4;
import java.util.Scanner;
public class Exercise9 {
	public static String reverse(String pal) {
		String check = "";
		for (int i = pal.length() - 1; i >= 0; i--) { //puts string in reverse order
			check = check + pal.charAt(i);
		}
		
		
		return check;
	}
	
	public static void palindrome(String pal) {
		pal = pal.replaceAll("\\s", ""); // gets rid of spaces to check palindrome
		
		if (pal.equals(reverse(pal)) == true) { //checks if strings are equal
			System.out.println("This is a palindrome!");
		}
		else {
			System.out.println("This is not a palindrome");
		}
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String user = "";
		
		System.out.print("Enter your palindrome to be checked: ");
		user = input.nextLine();
		
		palindrome(user);
		
		input.close();
	}
}
