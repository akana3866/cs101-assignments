package HW2;
import java.util.Scanner;

public class Exercise4{

	public static void main(String[] args){
		double f, c;

		Scanner input = new Scanner(System.in);
		System.out.println("Input Farenheight");
		f = input.nextInt();

		c = (double)0.556 * (f - 32);
		System.out.println(f + " Farenheight is " + c + " Celsius");

		input.close();
	}
}