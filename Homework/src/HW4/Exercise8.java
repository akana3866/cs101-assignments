package HW4;
import java.util.Scanner;
public class Exercise8 {

	public static int reversed(int num) {
		int newInt = 0;
		int curr = 0;
		while (num != 0) {
			
			curr = num % 10;
			newInt = newInt * 10 + curr;
			num /= 10;
			
		}
		
		return newInt;
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		System.out.print("Enter number to be reversed: ");
		user = input.nextInt();
		
		
		if(user >= 10) {
			System.out.println("Your number reversed is " + reversed(user));
		}
		else {
			System.out.print("Enter number greater than 10!");
		}
		
		input.close();
		
	}
}
