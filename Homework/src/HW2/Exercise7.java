package HW2;
import java.util.Scanner;
import java.text.*;

public class Exercise7{

	public static void main(String[] args){


		int x,y,z;
		double mean;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input:"); 
		String input = scanner.nextLine();    // get the entire line after the prompt 
		
		String[] numbers = input.split(" "); 

		x = Integer.parseInt(numbers[0]); 
		y = Integer.parseInt(numbers[1]);
		z = Integer.parseInt(numbers[2]); 

		mean = (double)(x + y + z) / 3;

		DecimalFormat f = new DecimalFormat("#.##");

		System.out.println("Output:");
		System.out.println(f.format(mean));
		scanner.close();
	}
}