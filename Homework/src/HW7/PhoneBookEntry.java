package HW7;

public class PhoneBookEntry {
	
	//constructors
	private int Id;
	private String firstName;
	private String lastName;
	private String email;
	private int zipcode;
	private String phoneNumber;
	
	
	//default constructor
	public PhoneBookEntry() {
		
	}
	
	//instantiates phonebookentry
	PhoneBookEntry(int id, String first, String last, String mail, int zip, String num){
		Id = id;
		firstName = first;
		lastName = last;
		email = mail;
		zipcode = zip;
		phoneNumber = num;
	}
	//overloaded constructor phonebookentry to accept multiple inputs
	PhoneBookEntry(String firstname, String number){
		firstName = firstname;
		phoneNumber = number;
	}
	
	PhoneBookEntry(String name){
		firstName = name;
	}
	
	//setters and getters
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//printBookEntry outputs of phonebook entry
	
	public void printBookEntry() {
		System.out.println("ID: " + this.Id);
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Email Address: " + this.email);
		System.out.println("Zipcode: " + this.zipcode);
		System.out.println("Phone Number: " + this.phoneNumber);
		System.out.println();
	}
}
