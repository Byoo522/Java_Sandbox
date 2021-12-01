package ConditionalStatements;

import java.util.Scanner;

public class HeightScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the SuperfAST Rollercoaster!");
		System.out.println("Please enter your height in centimeters: ");
		int height = scanner.nextInt();
		
//		if(height < 130) {
//			System.out.println("Sorry, you do not meet the height requirement.");
//		} else if (height > 210) {
//			System.out.println("Sorry, you are too tall.");
//		} else {
//			System.out.println("Height Accepted");
//		}
		
		if(height < 130 || height > 210) {
			System.out.println("Sorry, you do not meet the height requirement.");
		} else {
			System.out.println("Height Accepted");
		}
		
		
		// STRINGS
		System.out.println("pasta".equals("pasta"));

	}

}
