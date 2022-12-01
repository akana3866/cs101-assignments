package HW1;
import java.util.Scanner;

public class Exercise3{
	public static void main (String[] args){
		
		//creates scanner object
		
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Please enter your name:");
		
		//assigns scanner object to read user input
		
		String name = scanObj.nextLine();
		System.out.println("Hi " + name);

		scanObj.close();

	}
}