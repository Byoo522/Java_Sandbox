package arrays;

public class ArrayStuff {
	public static void main(String[] args) {
		int[] nums = {75, 29, 350, 7, 4192, 33};
		// nums[3] = 51; // this can reassign b at index 3 to new value of 51
		// System.out.println(nums[2]);
		int count = 0;
		int sumOfNums = 0;
		
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 100) {
				count++;
				sumOfNums += nums[i];
			}
		}
		int mean = sumOfNums / nums.length;
		System.out.println("Total Count: " + count + ", SumOfNums: " + sumOfNums + ", Mean: " + mean);
 	}
}
