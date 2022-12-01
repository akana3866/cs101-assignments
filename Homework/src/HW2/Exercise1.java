package HW2;
import java.util.Scanner;
public class Exercise1{
	public static void main(String args[]){
	
		int x, y, sum, sub, div, mul, rem;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first integer:");
		x = input.nextInt();

		System.out.println("Enter your second number:");
		y = input.nextInt();

		sum = x + y;
		System.out.println("Sum of x and y: " + sum);

		sub = x - y;
		System.out.println("Subtraction of x and y: " + sub);

		div = x / y;
		System.out.println("Division of x and y: " + div);
	
		mul = x * y;
		System.out.println("Multiplication of x and y: " + mul);

		rem = x % y;
		System.out.println("Remainder of x and y: " + rem);
	
		input.close();

	}
}