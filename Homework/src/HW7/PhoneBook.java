package HW7;

import java.util.Scanner;

public class PhoneBook {

//	1. Change the phone number of John Smith to 202555555
//	2. Print the attributes of John Smith using the method PrintBookEntry().
//	3. Assign the Zipcode of John Smith to James’s.
	public static void main(String[]args) {
		
		//variables for user input
		int id;
		String first;
		String last; 
		String mail;
		int zip;
		String num;
		
		Scanner input = new Scanner(System.in);
		
		//user input for first object
		//5
		System.out.println("id: ");
		id = input.nextInt();
		//john
		System.out.println("First Name: ");
		first = input.next();
		//smith
		System.out.println("Last Name: ");
		last = input.next();
		//jsmith@gmail.edu
		System.out.println("Mail: ");
		mail = input.next();
		//20037
		System.out.println("Zipcode: ");
		zip = input.nextInt();
		//2023334444
		System.out.println("Phone Number: ");
		num = input.next();
		
		//class object = new constructor(parameters);
		PhoneBookEntry firstObject = new PhoneBookEntry(id,first,last,mail,zip,num);
		
		//Print the attributes of John Smith using the method PrintBookEntry().
		firstObject.printBookEntry();
		
		//user input for second object
		//James
		System.out.println("First Name: ");
		first = input.next();
		//202344344
		System.out.println("Phone Number: ");
		num = input.next();
		//class object for second object using overloaded method
		PhoneBookEntry secondObject = new PhoneBookEntry(first,num);
		
		//user input for third object
		//sarah
		System.out.println("First name: ");
		first = input.next();
		
		//final class object using overloaded method of just name
		PhoneBookEntry thirdObject = new PhoneBookEntry(first);
		
		//Changes the phone number of John Smith to 202555555
		firstObject.setPhoneNumber("202555555");
		
		//Assign the Zipcode of John Smith to James’s.
		secondObject.setZipcode(firstObject.getZipcode());
	}	
		

}
