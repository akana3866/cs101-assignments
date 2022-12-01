package HW4;

public class Exercise6 {
	public static char randomLetter() {
		
		int number = 65 + (int)(Math.random() * (91 - 65));
		
		
		char randomLetter = (char) number;
		
		return randomLetter;
		
	}
	
	public static void main(String[]args) {
		System.out.println("You random letter is " + randomLetter());
	}

}
