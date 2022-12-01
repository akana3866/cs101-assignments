package HW3;
import java.util.Scanner;
public class Exercise4{
	public static void main(String[] args){
		String str1 = "";
		String str2 = "";
		String common = "";
		int i = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		str1 = input.nextLine();

		System.out.print("Enter the second string: ");
		str2 = input.nextLine();

		while(str1.charAt(i) == str2.charAt(i)){
			common += str1.charAt(i);
			i++;
		}

		if (common.length() > 0){
			System.out.println("The commmon prefix is " + common);
		}
		else{
			System.out.println(str1 + " and " + str2 +
				" have no commmon prefix");
		}

		input.close();

	}
}