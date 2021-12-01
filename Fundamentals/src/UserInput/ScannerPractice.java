package UserInput;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		// Creates a scanner and stored in variable. System.in - telling system to read standar input(keyboard)
		int age = 27;
		double statueHeightInMeters = 14.72;
		boolean hasInternetConnection = false;
		char userInput = '\u005A';
		String name = "Ben";
		Scanner a = new Scanner(System.in);
		String b = a.next(); // setting variable to the method to return data
		System.out.println(b);
	}
}
