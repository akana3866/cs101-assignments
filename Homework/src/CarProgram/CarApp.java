package CarProgram;
import java.util.Scanner;
public class CarApp {
	public static void searchRepair(CarEntry [] array, int car) {
		
		int id = 0;
		
		for(int i=0; i < car; i++) {
			if(array[i].getRepairStatus().equalsIgnoreCase("yes")){
				array[i].PrintCarInfo();
				id = 1;
			}
		}
		if(id == 0) {
			System.out.println("No cars that are repaired.");
		}
		
	}
	
	public static void searchPrice(CarEntry [] array, int car) {
		
		int id = 0;
		int price = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base price: ");
		price = input.nextInt();
		
		for(int i=0; i < car; i++) {
			if(array[i].getServicePrice() > price){
				array[i].PrintCarInfo();
				id = 1;
			}
		}
		if(id == 0) {
			System.out.println("No cars that are above that price.");
		}
		
	}
	
	public static void searchMake(CarEntry [] array, int car) {
		
		int id = 0;
		String make;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the make your looking for: ");
		make = input.next();
		
		for(int i=0; i < car; i++) {
			if(array[i].getCarMake().equalsIgnoreCase(make)){
				array[i].PrintCarInfo();
				id = 1;
			}
		}
		if(id == 0) {
			System.out.println("No cars that are of that make.");
		}
		
	}
	
	public static void addCar(CarEntry [] array, int car) {
		String make;
		String status;
		int price;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Car Make : ");
		make = input.next();
		
		
		System.out.println("Enter Service Price: ");
		price = input.nextInt();
		
		
		status = "NO";
				
		System.out.println("Enter Owner Name: ");
		name = input.next();
		
		array[car] = new CarEntry(make, price, status, name);
		
		
	}
	public static void deleteCar(CarEntry [] array, int car) {
        int index; 
        
		
        Scanner input = new Scanner(System.in);

        System.out.println("Which Car Entry number do you want to delete from 0 to " +(car - 1)); 
        index = input.nextInt();
 
        array[index].setCarMake(null);
        array[index].setServicePrice(0.0);
        array[index].setRepairStatus(null);
        array[index].setFullName(null);
        
        if(array.length > 0) {
        	for(int i = index; i < car; i++) {
        		array[i] = array[i+1];
        	}
        }
        
        
	}
	public static void displayInfo(CarEntry [] array, int car) {
		for(int i = 0; i < car; i++) {
			array[i].PrintCarInfo();
		}
	}
	
	public static void editCar(CarEntry [] array, int car) {
		int index;
		int choice;
		
		String make;
		double price;
		String status;
		String name;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which car entry would you like to edit from 0 to " + (car - 1));
		index = input.nextInt();
		
		System.out.println("Which would you like to edit: ");
		System.out.println("1. Make\n2. Price\n3. Status\n4. Name");
		choice = input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Change make to: ");
			make = input.next();
			array[index].setCarMake(make);
			break;
		case 2:
			System.out.println("Change price to: ");
			price = input.nextDouble();
			array[index].setServicePrice(price);
			break;
		case 3:
			System.out.println("Change status to YES or NO: ");
			status = input.next();
			array[index].setRepairStatus(status);
			break;
		case 4:
			System.out.println("Change name to: ");
			name = input.next();
			array[index].setFullName(name);
			break;
		}
		
	}
	
	public static void markRepair(CarEntry [] array, int index) {
		array[index].setRepairStatus("YES");
	}
	
	public static void sortPrice(CarEntry[] array, int car) {
		int min;
		double curr;
		for(int i = 0; i < car - 1; i++) {
			curr = array[i].getServicePrice();
			min = i;
			for(int j = i + 1; j < car; j ++) {
				if(curr > array[j].getServicePrice()) {
					curr = array[j].getServicePrice();
					min = j;
				}
			}
		if(curr != i) {
			CarEntry newMin = new CarEntry(array[min].getCarMake(), array[min].getServicePrice(), array[min].getRepairStatus(),array[min].getFullName());
			array[min] = array[i];
			array[i] = newMin;
		}
		}
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int user = 1;
		int cars = 0;
		int index = 0;
		CarEntry [] arr = new CarEntry[100];
		while (user != 10) {
			System.out.println("");
			System.out.println("1. Add a Car\n2. Delete a Car\n3. Edit a Car\n4. Mark a car as \"repaired\" \n5. Display all cars and their information");
			System.out.println("6. Display all cars that are repaired\n7. Display all cars that their service repair is above a certain price\n8. Display all cars of a specific make\n9. Sort cars by service price\n10. Exit");
			user = input.nextInt();
			switch(user) {
			case 1:
				//to view added item display all cars and their information
		        addCar(arr, cars);
		        cars += 1;
				break;
			case 2:
				//to view array without the deleted item display all cars and their information
				deleteCar(arr,cars);
				cars -= 1;
				break;
			case 3:
				//to view edits made display all cars and their information
				editCar(arr,cars);
				break;
			case 4:
				//to repair status changed display all cars and their information
				System.out.println("Which car entry would you like to edit from 0 to " + (cars - 1));
				index = input.nextInt();
				markRepair(arr,index);
				break;
			case 5:
			    displayInfo(arr, cars);
				break;
			case 6:
			    searchRepair(arr, cars);
				break;
			case 7:
			    searchPrice(arr,cars);
				break;
			case 8:
			    searchMake(arr,cars);
				break;
			case 9:
				//to view sorted list display all cars and their information
			    sortPrice(arr,cars);
				break;
		}
	}
		System.out.println("Goodbye");
		
  }
}
