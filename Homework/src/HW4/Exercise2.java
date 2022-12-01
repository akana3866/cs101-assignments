package HW4;
import java.util.Scanner;
public class Exercise2 {

public static int sum(int num1, int num2) {
	int sum = 0;
	int last = 0;
	
	sum = num1 + num2;
	
	last = sum % 10;
	
	return last;
	
}

public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	int user = 0;
	int user2 = 0;
	int fin = 0;
	
	System.out.print("Enter your number: ");
	user = input.nextInt();
	
	System.out.print("Enter your second number: ");
	user2 = input.nextInt();
	
	fin = sum(user, user2);
	
	System.out.println("The last digit of " + user + " is " + fin);
	input.close();
	
}

}
