package HW7;
import java.io.*;
import java.util.Scanner;
//Add a phone entry
// Edit a phone entry of a given first name and last name
// Delete a phone entry of a given first name and last name
//A PhoneBookAdmin should be able to do the following:
// Sort the PhoneBookDirectory
// Search using Linear Search
// Search using Binary Search
// Print Admin’s info
// Change Password
// Change Username 
//Define an interface for PhoneBookAdmin that will have the methods to be implemented by phonebookadmin
public class PhoneBookAdmin extends User implements UserInterface{
	//admin specific parameter
	public String email;
	
		
	public PhoneBookAdmin() {
			
		}
		//admin parameters and intializing
		PhoneBookAdmin(String Username, String Password, PhoneBookDirectory Dir, String Email){
			username = Username;
			password = Password;
			phonebook = Dir;
			email = Email;

	}
		
		//changes password of admin
		 public void changePassword(String key) {
				 password = key;
			    }
			 
			 //changes username of admin
			 public void changeUsername(String info) {
				 username = info;
			 }
		//prints admin ingo
		public void PrintUserInfo() {
			System.out.println(username);
			System.out.println(password);
			System.out.println(email);
			
		}
}
