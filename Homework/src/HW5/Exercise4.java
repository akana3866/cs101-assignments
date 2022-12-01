package HW5;
import java.util.Scanner;
public class Exercise4 {
	public static boolean isSorted(int[] list) {
		
		for(int i = 1; i < list.length; i++) {
			if(list[i] < list[i-1]) { //checks if the current number is less than the previous number
				return false;
			}
		}
		return true;
	}
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int length =  0;
		
		System.out.print("Enter list length: "); //determines length of array
		length = input.nextInt();
		
		int [] user = new int[length];
		System.out.print("Enter your integers: ");
		
		for(int i = 0; i < length; i++) { //puts user input into array
			user[i] = input.nextInt();
		}
		
		if(isSorted(user) == true) { //tests whether list is sorted or not
			System.out.println("The list is already sorted.");
		}
		else {
			System.out.println("The list is not sorted.");
		}
		
		input.close();
	}

}
