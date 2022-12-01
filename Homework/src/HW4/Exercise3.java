package HW4;
import java.util.Scanner;
public class Exercise3 {
	public static double circleArea(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		System.out.print("Enter radius: ");
		user = input.nextInt();
		
		System.out.println("The area of the cirle with radius " + user + " is " + circleArea(user));
		input.close();
	}

}
