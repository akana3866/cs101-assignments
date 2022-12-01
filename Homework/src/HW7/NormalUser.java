package HW7;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// Add a phone entry
// Edit a phone entry of a given first name and last name
// Sort the PhoneBookDirectory
// Search using Linear Search
// Print user’s info

// Define an interface for the NormalUser that will have the methods to be implemented by
//NormalUser. 
public class NormalUser extends User implements UserInterface{
	//normaluser specific parameter
	public int id;
		
			
	public NormalUser() {
				
		}
		//defines parameters of normal user
		NormalUser(String Username, String Password, PhoneBookDirectory Dir, int ID){
			username = Username;
			password = Password;
			phonebook = Dir;
			id = ID;

		}
		
		//prints info of normal user
		
		@Override
		public void PrintUserInfo() {

			System.out.println(username);
			System.out.println(password);
			System.out.println(id);
		}
		
	}
