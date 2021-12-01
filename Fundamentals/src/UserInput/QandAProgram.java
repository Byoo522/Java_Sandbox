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
		
		System.out.println("Where are you from?");
		String userLocation = scanner.next();
		System.out.println("You are from " + userLocation);
	}

}
