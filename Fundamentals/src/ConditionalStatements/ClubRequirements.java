package ConditionalStatements;

import java.util.Scanner;

public class ClubRequirements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("The VIP Lounge");
		System.out.println("Age: ");
		int age = scanner.nextInt();
		
		System.out.println("Do you have a VIP Pass? yes/no");
		String vipPassReply = scanner.next();
		
		if(age >= 18 && vipPassReply.equals("yes")) {
			System.out.println("Thanks, go on in");
		} else {
			System.out.println("Sorry, you may not enter.");
		}

	}

}
