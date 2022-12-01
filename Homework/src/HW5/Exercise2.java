package HW5;
import java.util.Scanner;
public class Exercise2 {
	
	public static void occurrences(int[] arr) {
        for (int i = 1; i <= 100; i++) { // goes through numbers 1 through 100
            int count = 0;
            for (int j = 0; j < arr.length - 1; j++) { //goes through the array (j is the index)
                if (arr[j] == i) //if the number in array occurs between 1-100 count adds 
                    count += 1; 
            }
            if (count != 0) { //prints occurrences
                if(count>1) System.out.println(i + " occurs " + count + " times");
                else System.out.println(i + " occurs " + count + " time");
            }
        } 
    }
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] user = new int[100]; //user array
        int num; //user input
        int count = 0; //index
        
        System.out.println("Enter the integers between 1 and 100 (zero exits): ");
        
        do
        {
            num = input.nextInt();
            user[count] = num; 
            count += 1;
        }
        while (num != 0);

        occurrences(user);
        input.close();
    }


}

