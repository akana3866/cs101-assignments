package HW3;
import java.util.Scanner;
public class Exercise2{
	public static void main(String[]args){
		int num = 0;
		int pow = 0;
		int total = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an interger: ");
		num = input.nextInt();

		System.out.print("What power do you want " + num);
		System.out.print(" to be raised to? ");
		pow = input.nextInt();

		total = num;

		for(int i=0; i<pow-1; i++){

			total *= num;

		}
		System.out.print(num);

		for(int x=0; x<pow-1; x++){
			System.out.print(" x " + num);
		}

		System.out.print(" = " + total);
		input.close();
	}
}