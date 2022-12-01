package HW4;
import java.util.Scanner;
public class Exercise7 {
	public static int randomNum(int a, int b) {
		
		int number = a + (int)(Math.random() * (b - a));
		
		
		return number;
		
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.print("Enter you minimum number: ");
		x = input.nextInt();
		System.out.print("Enter you minimum number: ");
		y = input.nextInt();
		System.out.println("You random number is " + randomNum(x,y));
		
		input.close();
	}

}
