package HW4;
import java.util.Scanner;
public class Exercise5 {
	public static void multiple(int num1, int num2) {
		if (num1 % num2 == 0) {
			System.out.println("It is a multiple!");
		}
		else {
			System.out.println("It is not a multiple");
		}
	}
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int one = 0;
		int two = 0;
		
		System.out.print("Enter a number: ");
		one = input.nextInt();
		
		System.out.print("Enter the number to check if it is a multiple: ");
		two = input.nextInt();

		multiple(one,two);
		
		input.close();
		
	}

}
