package HW5;
import java.util.Scanner;

public class Exercise1 {
	
	public static void reverse(int [] arr) {
		
		
		for (int x = arr.length - 1; x >= 0; x--) { //starts at 9 and prints the string in a reversed order
			System.out.print(arr[x] + " ");
		}
		
	}
	
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		int [] user = new int[10];
		
		
		System.out.print("Enter 10 integers: ");
		
		for (int i = 0; i < 10; i++) {
			 user[i] = input.nextInt();
		 }
		
		reverse(user);
		input.close();
		
	}

}
