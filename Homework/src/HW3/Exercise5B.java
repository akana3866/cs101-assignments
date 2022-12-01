package HW3;
import java.util.Scanner;

public class Exercise5B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int num = 0;
		int curr = 0;
		String bin = "";

		System.out.print("Enter your number to convert: ");
		num = input.nextInt();
		curr = num;

		do{
			if(curr%2 == 0){
				bin = bin.concat("0");
			}
			else{
				bin = bin.concat("1");
			}

			curr /= 2;
		}

		while(curr != 1);

		System.out.print(num);
		System.out.print(" in binary is " + bin);
		input.close();

	}
}