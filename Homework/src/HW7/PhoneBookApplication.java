package HW7;
import java.util.Scanner;
import java.io.*;
public class PhoneBookApplication {
	

	
	public static void main(String args[]) throws IOException {
		//intializing variables
		String username;
		String password;
		String emailID;
		String user = null;
		String pass = null;
		String mail = null;
		String nuser = null;
		String npass = null;
		String ID="";
		int counter = 0;
		int count;
		int option = 1;
		int Id = 0;
		boolean admin = false;
		boolean normaluser = false;
		
		
		
		//Reads normal user info and stores
		Scanner scan1 = new Scanner(new FileReader("NormalUser.txt"));
		while(scan1.hasNextLine()) {
		           
		           String descritpion = scan1.nextLine();
		            
		          
		           String []temp = descritpion.split(",");   
		          
		           nuser  = temp[0];   
		           npass = temp[1];
		           ID = temp[2];
		      
		          System.out.println("name : "+ nuser);   
		          System.out.println("pass : "+ npass);
		          System.out.println("ID : "+ ID);
		      
		             
		 }
		//reads admin info and stores
		Scanner scan = new Scanner(new FileReader("AdminInfo.txt"));
		while(scan.hasNextLine()) {
		           
		           String descritpion = scan.nextLine();
		            
		          
		           String [] temp = descritpion.split(",");   
		          
		           user  = temp[0];   
		           pass = temp[1];
		           mail = temp[2];
		      
		          System.out.println("user : "+ user);   
		          System.out.println("pass : "+ pass);
		          System.out.println("email : "+ mail);
		      
		             
		 }
		
		//compares user input to admin and user text file
		Scanner input = new Scanner(System.in);
		
		while(admin == false && normaluser == false) {
			
			System.out.println("Enter your username: ");
			username = input.next();
			
			System.out.println("Enter your password: ");
			password = input.next();
			
			System.out.println("Enter your email/ID: ");
			emailID = input.next();
			
			if(username.equals(user) && password.equals(pass) && emailID.equals(mail)) {
				admin = true;
			}
			else if(username.equals(nuser) && password.equals(npass) && emailID.equals(ID)) {
				normaluser = true;
				Id = Integer.parseInt(emailID);
			}
			else {
				System.out.println("Login is incorrect try again!");
			}
			
		}
    
		
		PhoneBookDirectory phonebook = new PhoneBookDirectory();
		
		
		if(admin == true) { //if there is no mail it will run the admin user
			System.out.println("Welcome Admin User");
			PhoneBookAdmin user1 = new PhoneBookAdmin(user,pass,phonebook,mail);
			
			while(option < 10 && option > 0) {
				System.out.println("1.Add Phone Entry\n2.Edit Phone Entry of First and Last Name\n3.Delete Phone Entry of Given Name");
				System.out.println("4.Sort Directory\n5.Search Using Linear Search By Number\n6.Search Using Binary Search by ID\n7.Print Admin's Info");
				System.out.println("8.Change Password\n9.Change Username\n10.Exit");
				System.out.println("Please choose an option");
				option = input.nextInt();
				switch(option) {
				case 1:
					int id;
					String first;
					String last; 
					String email;
					int zip;
					String num;
					
					System.out.println("id: ");
					id = input.nextInt();
					System.out.println("First Name: ");
					first = input.next();
					System.out.println("Last Name: ");
					last = input.next();
					System.out.println("Mail: ");
					mail = input.next();
					System.out.println("Zipcode: ");
					zip = input.nextInt();
					System.out.println("Phone Number: ");
					num = input.next();
					
					PhoneBookEntry entry = new PhoneBookEntry(id,first,last,mail,zip,num);
					user1.phonebook.addEntry(entry, counter);
					
					counter++;
					break;
				case 2:
					String ename;
					String elastname;
					System.out.println("Enter first name: ");
					ename = input.next();
					System.out.println("Enter last name: ");
					elastname = input.next();
					user1.phonebook.Edit(ename, elastname,counter);
					break;
					
				case 3:
					String name;
					String lastname;
					System.out.println("Enter first name: ");
					name = input.next();
					System.out.println("Enter last name: ");
					lastname = input.next();
					user1.phonebook.DeleteEntry(name,lastname, counter);
					counter--;
					break;
					
				case 4:
					user1.phonebook.SortbyId(counter);
					break;
				case 5:
					String number;
					System.out.println("Enter the Phone Number");
					number = input.next();
					user1.phonebook.LinearSearchByPhoneNumber(number, counter);
					break;
				case 6:
					int iD;
					System.out.println("Enter Id");
					iD = input.nextInt();
					user1.phonebook.SearchbyIdBinarySearch(iD, counter);
					break;
				case 7:
					user1.PrintUserInfo();
					phonebook.printEntries(counter);
					break;
				case 8:
					String key;
					System.out.println("What would you like to change password to?");
					key = input.next();
					user1.changePassword(key);
					break;
				case 9:
					String idUser;
					System.out.println("What would you like to change username to?");
					idUser = input.next();
					user1.changeUsername(idUser);
					break;
				case 10:
					break;
				}
			}
			System.out.println("Goodbye");
		}
		else { //if there is mail it will run normal function
			System.out.println("Welcome Normal User");
			NormalUser user2 = new NormalUser(user,pass,phonebook,Id);
			while(option < 6 && option > 0) {
				System.out.println("1.Add Phone Entry\n2.Edit Phone Entry of First and Last Name");
				System.out.println("3.Sort Directory\n4.Search Using Linear Search By Number\n5.Print Normal User Info\n6.Exit");
				System.out.println("Please choose an option");
				option = input.nextInt();
				switch(option) {
				case 1:
					int id;
					String first;
					String last; 
					String email;
					int zip;
					String num;
					
					
					System.out.println("id: ");
					id = input.nextInt();
					System.out.println("First Name: ");
					first = input.next();
					System.out.println("Last Name: ");
					last = input.next();
					System.out.println("Mail: ");
					mail = input.next();
					System.out.println("Zipcode: ");
					zip = input.nextInt();
					System.out.println("Phone Number: ");
					num = input.next();
					
					PhoneBookEntry entry = new PhoneBookEntry(id,first,last,mail,zip,num);
					user2.phonebook.addEntry(entry,counter);
					
					counter++;
					break;
				case 2:
					String ename;
					String elastname;
					System.out.println("Enter first name: ");
					ename = input.next();
					System.out.println("Enter last name: ");
					elastname = input.next();
					user2.phonebook.Edit(ename, elastname, counter);
					break;
							
				case 3:
					user2.phonebook.SortbyId(counter);
					break;
				case 4:
					String number;
					System.out.println("Enter the Phone Number");
					number = input.next();
					user2.phonebook.LinearSearchByPhoneNumber(number, counter);
					break;
				case 5:
					user2.PrintUserInfo();
					phonebook.printEntries(counter);
					break;
				case 6:
					break;

				}
	
				}
			
				System.out.println("Goodbye");
		}
		
	}

}