package HW3;
import java.util.Scanner;

public class Exercise5A{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.print("Enter your number to convert: ");
		num = input.nextInt();
		
		System.out.println("The binary is " + Integer.toBinaryString(num));

		input.close();

	}
}