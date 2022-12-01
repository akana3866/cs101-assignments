package HW4;
import java.util.Scanner;
public class Exercise1 {
	public static void balance(double curr) {
		System.out.println("Your current balance is " + curr);
	}
	public static double withdraw(double curr, double with) {
		
		if(with < curr) {
			curr -= with;
			return curr;
		}
		else {
			System.out.println("You do not have enough money!");
			return curr;
		}
	}
	public static double deposit(double curr, double dep) {
		curr += dep;
		return curr;
	}
	
	public static void exit() {
		System.out.println("Goodbye");
	}
	public static void main(String[]args) {
		double balance = 0.0;
		int user = 0;
		double money = 0;
		Scanner input = new Scanner(System.in);
		while(user != 4) {
			System.out.println("1. View balance \n2. Deposit Cash \n3. Withdraw Cash \n4. Exit");
			System.out.print("Enter your selction: ");
			user = input.nextInt();
			switch(user){
				case 1:
					balance(balance);
					break;
				case 2:
					System.out.print("Enter the amount you would like to deposit: ");
					money = input.nextDouble();
					balance = deposit(balance, money);
					break;
				case 3:
					System.out.print("Enter the amount you would like to withdraw: ");
					money = input.nextDouble();
					balance = withdraw(balance, money);
					break;
				case 4:
					exit();
					break;
			}
		}
		input.close();
		
	}

}
