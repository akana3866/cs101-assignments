package HW3;
import java.util.Scanner;
public class Exercise1{
	public static void main(String[] args){
		double bal = 0;
		int dep = 0;
		int with = 0;
		int user = 0;

		Scanner input = new Scanner(System.in);

		while (user != 4){
			System.out.println("1. View your Balance");
			System.out.println("2. Deposit Cash");
			System.out.println("3. Withdraw Cash");
			System.out.println("4. Exit");
			System.out.print("Enter your selection: ");
			user = input.nextInt();
			switch (user){
				case 1: 
					System.out.println("Your current balance is " + bal);
					break;
				case 2:
					System.out.print("Enter the amount you want to deposit: ");
					dep = input.nextInt();
					bal += dep;
					dep = 0;
					break;
				case 3:
					System.out.print("Enter the amount you want to withdraw: ");
					with = input.nextInt();
					if (bal > with){
						bal -= with;
					}
					else{
						System.out.println("Sorry you don't have enough balance!");
					}
					break;					
				case 4:
					System.out.println("Goodbye");
					break;
			}
		}
		input.close();
	}
}