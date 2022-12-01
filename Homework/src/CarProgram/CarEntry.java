package CarProgram;

public class CarEntry {

	private String carMake;
	private double servicePrice;
	private String repairStatus;
	private String fullName;


	CarEntry(String make, double price, String status, String name){
		carMake = make;
		servicePrice = price;
		repairStatus = status;
		fullName = name;
		
}


	public String getCarMake() {
		return carMake;
	}


	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}


	public double getServicePrice() {
		return servicePrice;
	}


	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}


	public String getRepairStatus() {
		return repairStatus;
	}


	public void setRepairStatus(String repairStatus) {
		this.repairStatus = repairStatus;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void PrintCarInfo() {
		
		System.out.println("Name: " + this.getFullName());
		System.out.println("Car Make:  " + this.carMake);
		System.out.println("Service Price: " + this.servicePrice);
		System.out.println("Repair Status " + this.repairStatus);
		System.out.println("");
	}
}