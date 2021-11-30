package variables;

public class VariableManipulationAndIntegerDivision {
	public static void main(String[] args) {
		int x = 15;
		System.out.println(x); // 15 
		x = 32;
		System.out.println(x); // 32
		x = 1000;
		System.out.println(x); // 1000
		
		// make one or both a double to get true answer for divisions
		System.out.println(15 / 6); // 2 not 2.5
		System.out.println(15.0 / 6); // 2.5
		System.out.println(15.0 / 6.0); // 2.5
	}
}
