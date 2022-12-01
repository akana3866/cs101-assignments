package HW2;
import java.util.Scanner;

public class Exercise3{

	public static void main(String[] args){

		double min, curr, per;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter desired grade:");
		String des = input.nextLine();

		System.out.println("Enter minimum average required:");
		min = input.nextDouble();

		System.out.println("Enter current average in course");
		curr = input.nextDouble();

		System.out.println("Enter how much the final count as a percentage of the course grade:");
		per = input.nextDouble() / 100;

		double scr = (min - (curr * (1-per))) / per;

		Double finScr = (double) (Math.round(scr*10.0)/10.0);

		System.out.print("You need a score of " + finScr);
		System.out.print(" on the final to get a" + des);

		input.close();

	}
}