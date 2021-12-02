package arrays;

public class ArrayStuff {
	public static void main(String[] args) {
		int[] b = {75, 29, 350, 7, 4192};
		b[3] = 51; // this can reassign b at index 3 to new value of 51
		System.out.println(b[2]);
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}
 	}
}
