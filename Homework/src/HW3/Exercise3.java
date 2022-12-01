package HW3;
public class Exercise3 {
	public static void main(String[] args) {
		
		int count = 0;	

		
		for (int i =65; i <= 126; i++) {
			count++;
			
			if (count % 5 == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");	
		}
		System.out.println();
		
	}
	//Code found from: https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_05/Exercise_05_15/Exercise_05_15.java
}