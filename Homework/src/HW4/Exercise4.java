package HW4;
import java.util.Scanner;
public class Exercise4 {
	public static int evenOdd(int num) {
		if((num % 2) == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		System.out.print("Enter your number: ");
		user = input.nextInt();
		
		System.out.println(evenOdd(user));
		
		input.close();
	}

}
