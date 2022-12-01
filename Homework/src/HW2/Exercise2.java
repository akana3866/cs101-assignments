package HW2;
import java.util.Scanner;

public class Exercise2{
	
	public static void main(String[] args){
		
		double km, m;

		Scanner input = new Scanner(System.in);
		System.out.println("Input Kilmoeters");
		km = input.nextInt();

		m = km * (double)0.6214;
		System.out.println(km + " kilometers is " + m + " miles");

		input.close();

	}
}