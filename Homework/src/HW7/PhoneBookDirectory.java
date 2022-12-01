package HW7;

import java.util.Scanner;

public class PhoneBookDirectory {
	
	PhoneBookDirectory() {
		
	}
	
	public PhoneBookEntry[] phonebook = new PhoneBookEntry[6];
	
	//add entry to PhoneBookDirectory
	
	public int addEntry(PhoneBookEntry entry, int count) {
		if(count == 5) {
			return 0;
		}
		else {
			phonebook[count] = entry;
			return 1;
		}
	}
	//prints array of entries
	public void printEntries(int count) {
		for(int i = 0; i < count; i++) {
			phonebook[i].printBookEntry();
			System.out.println();
		}
	}
	
	//searches using linear by given phonenumber
	public int LinearSearchByPhoneNumber(String PhoneNumber, int count) {
		for(int i = 0; i <count; i++) {
			if(phonebook[i].getPhoneNumber().equals(PhoneNumber)) {
				phonebook[i].printBookEntry();
				return 1;
			}
		}
		return 0;
	}
	//searches array index given id
	public PhoneBookEntry SearchbyIdBinarySearch(int id, int count) {
		  int high = count - 1;
		  int low = 0;
		  
		  int min;
			double curr;
			for(int i = 0; i < count - 1; i++) {
				curr = phonebook[i].getId();
				min = i;
				for(int j = i + 1; j < count; j ++) {
					if(curr > phonebook[j].getId()) {
						curr = phonebook[j].getId();
						min = j;
					}
				}
			if(curr != i) {
				PhoneBookEntry newMin = new PhoneBookEntry(phonebook[min].getId(),phonebook[min].getFirstName(),phonebook[min].getLastName(),phonebook[min].getEmail(),phonebook[min].getZipcode(),phonebook[min].getPhoneNumber());
				phonebook[min] = phonebook[i];
				phonebook[i] = newMin;
			}
			}
		  
		  while(high >= low) {
			  int mid = (low + high) / 2;
			  if(id < phonebook[mid].getId()) {
				high = mid -1;  
			  }else if(id == phonebook[mid].getId()) {
				 PhoneBookEntry newPB =  new PhoneBookEntry(phonebook[mid].getId(), phonebook[mid].getFirstName(), phonebook[mid].getLastName(), phonebook[mid].getEmail(), phonebook[mid].getZipcode(), phonebook[mid].getPhoneNumber());
				 newPB.printBookEntry();
				return newPB;
			  }else {
				low = mid + 1;
			  }	  
		  }
		  return new PhoneBookEntry();
		
	}

	
	//edits elements given firstname and last name
	public int Edit(String firstName, String lastName, int count) {
		int index = -1;
		int choice;
		
		int id; 
		String first;
		String last; 
		String mail;
		int zip; 
		String num;
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < count; i++) {
		if(phonebook[i].getFirstName().equals(firstName) && phonebook[i].getLastName().equals(lastName)) {
			index = i;
		}
		}
		if(index >= 0) {
			System.out.println("Which would you like to edit: ");
			System.out.println("1. Id\n2. First Name\n3. Last Name\n4. Email\n5. ZipCode\n6. Phone Number");
			choice = input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Change Id to: ");
			id = input.nextInt();
			phonebook[index].setId(id);
			break;
		case 2:
			System.out.println("Change First Name to: ");
			first = input.next();
			phonebook[index].setFirstName(first);
			break;
		case 3:
			System.out.println("Change Last Name to: ");
			last = input.next();
			phonebook[index].setLastName(last);;
			break;
		case 4:
			System.out.println("Change Email to: ");
			mail = input.next();
			phonebook[index].setEmail(mail);
			break;
		case 5:
			System.out.println("Change Zip to: ");
			zip = input.nextInt();
			phonebook[index].setZipcode(zip);
			break;
		case 6:
			System.out.println("Change Phone Number to: ");
			num = input.next();
			phonebook[index].setPhoneNumber(num);
			break;
		}
		return 1;
		}
		
		return 0;
		
	}
	//deletes and shifts array given id
	public int DeleteEntry(int id, int count) {
		int index; 
        
		
        Scanner input = new Scanner(System.in);

        System.out.println("Which index would you like to delete"); 
        index = input.nextInt();
 
        phonebook[index].setId(0);
        phonebook[index].setFirstName(null);
        phonebook[index].setLastName(null);
        phonebook[index].setEmail(null);
        phonebook[index].setZipcode(0);
        phonebook[index].setPhoneNumber(null);
        
        if(count > 0) {
        	for(int i = index; i < count; i++) {
        		phonebook[i] = phonebook[i+1];
        	}
        	
        	return 0;
        }
        return 1;
	}
	//deletes given names
	public int DeleteEntry(String first, String last, int count) {
		int index=-1; 
        
		for(int i = 0; i < count; i++) {
			if(phonebook[i].getFirstName().equals(first) && phonebook[i].getLastName().equals(last)) {
				index = i;
				phonebook[index].setId(0);
		        phonebook[index].setFirstName(null);
		        phonebook[index].setLastName(null);
		        phonebook[index].setEmail(null);
		        phonebook[index].setZipcode(0);
		        phonebook[index].setPhoneNumber(null);
			}
		}
		 if(index>=0) {
		 for(int j = index; j < count; j++) {
	        		phonebook[j] = phonebook[j+1];
	        		return 1;
	        	}
		       
			
		 }
       
     
        
		return 0;
  
	}
	//sorts array from lost to high id
	public void SortbyId(int counter) {
		int min;
		double curr;
		for(int i = 0; i < counter - 1; i++) {
			curr = phonebook[i].getId();
			min = i;
			for(int j = i + 1; j < counter; j ++) {
				if(curr > phonebook[j].getId()) {
					curr = phonebook[j].getId();
					min = j;
				}
			}
		if(curr != i) {
			PhoneBookEntry newMin = new PhoneBookEntry(phonebook[min].getId(),phonebook[min].getFirstName(),phonebook[min].getLastName(),phonebook[min].getEmail(),phonebook[min].getZipcode(),phonebook[min].getPhoneNumber());
			phonebook[min] = phonebook[i];
			phonebook[i] = newMin;
		}
		}
	}
	
}

