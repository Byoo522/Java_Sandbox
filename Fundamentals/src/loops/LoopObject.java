package loops;

public class LoopObject {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println("while loop test");
			i = i + 1;
		}
		
		for(int j = 0; j < 10; j++) {
			if(j == 4) {
				break; // stops
				// continue - skips element
			}
			System.out.println("j");
		}

	}

}
