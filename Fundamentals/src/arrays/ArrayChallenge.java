package arrays;

public class ArrayChallenge {
	
	public static void main(String[] args) {
		//	Create an integer array of 10 elements and give each element an arbitrary value. 
		//	Print out the entire array using a loop.
		int[] intArr = new int[10];
		intArr[0] = 45;
		intArr[1] = 865;
		intArr[2] = 23;
		intArr[3] = 6;
		intArr[4] = 368;
		intArr[5] = 9032;
		intArr[6] = 557;
		intArr[7] = 226;
		intArr[8] = 834564;
		intArr[9] = 34001;
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		};
		
		int[] intArr2 = new int[20];
		for(int j = 0; j < intArr2.length; j++) {
			intArr2[j] = j + 1;
			System.out.println(intArr2[j]);
		}
		
	}
	
	
}
