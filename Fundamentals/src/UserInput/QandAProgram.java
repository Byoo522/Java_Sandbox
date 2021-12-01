package UserInput;

import java.util.Scanner;

public class QandAProgram {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		// new scanner created
		Scanner scanner = new Scanner(System.in);
		// blocks next step and waits for user input
		String userName = scanner.next();
		System.out.println(userName + " is a nice name.");
		
		System.out.println("\nHow old are you " + userName + "?");
		int userAge = scanner.nextInt();
		System.out.println("Your name is " + userName + " and you are " + userAge + " years old");
		
		System.out.println("\nHow tall are you?");
		double userHeight = scanner.nextDouble();
		System.out.println("You are " + userHeight + "ft tall");
		
		// VERY IMPORTANT ABOUT SYSTEM.OUT.FORMAT
		System.out.format("I have %.2f dollars, %d dogs, and 1 %s.", 100.00, 2, "cars");
//		double averageMaleHeightDifference = userHeight - 1.75;
//		double averageFemaleHeightDifference = userHeight - 1.35;
		
	}

}
