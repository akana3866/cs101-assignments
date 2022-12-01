package HW2;
import java.util.Scanner;

public class Exercise5{

	public static void main(String[] args){

		String usr, pswrd; 
		pswrd = "NYU1256";

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you password:");
		usr = input.nextLine();

		if (usr.equals(pswrd) == true){

			System.out.println("Valid Password");
		}
		else {

			System.out.println("Invalid Password");
		}
		input.close();
	}
}