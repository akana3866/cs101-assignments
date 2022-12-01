package HW5;
import java.util.Scanner;
public class Exercise3 {
	public static double average (int [] array) { //if input is int
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum / array.length;
		
	}
	public static double average (double [] array) { //if input is double
		
		double sum = 0.0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum / array.length;
		
	}
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double [] user = new double[10];
		
		System.out.print("Enter 10 integers: ");
		
		for(int i = 0; i < user.length; i++) {
			
			user[i] = input.nextDouble();
		}
		
		System.out.println("The average of the sum of integers is " + average(user)); //will run to either method depending on input type
		input.close();
	}
}
