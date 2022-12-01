package HW2;
import java.util.Scanner;

public class Exercise6{
	
	public static void main(String[] args){

		int x, y, max;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number:");
		x = input.nextInt();

		System.out.println("Enter second number:");
		y = input.nextInt();

		max = Math.max(x ,y);
		System.out.println("The greatest number is " + max);
		
		input.close();

	}
}