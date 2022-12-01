package HW7;
import java.io.*;
import java.util.Scanner;

// Add a phone entry
// Edit a phone entry of a given first name and last name
// Sort the PhoneBookDirectory
// Search using Linear Search
// Print user’s info



public class User {
	
 //parameters for user
	//public for inherited classes
	public String username;
	public String password;
	public PhoneBookDirectory phonebook;
	public User() {
		
	}
	//user parameters
	User(String Username, String Password, PhoneBookDirectory Dir){
		//inheritied by child classes
		username = Username;
		password = Password;
		phonebook = Dir;
	}
	//prints userinfo
	public void PrintUserInfo() {

	    /*System.out.println("User Info:");
	    try (BufferedReader breader = new BufferedReader(new FileReader("NormalInfo.txt"))) {
	    	   String text = null;
	    	   while ((text = breader.readLine()) != null) {
	    	       System.out.println(text);
	    	   }
	    	}*/
		System.out.println(username);
		System.out.println(password);

	}
	
	
}




