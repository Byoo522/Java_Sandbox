package methods;

public class MethodPractice1 {
	
	public static void main(String[] args) {
		int var;
		var = 5;
		foo(var, 57.5, "caramel");
//		foo(1);
//		foo(3);
//		foo(555);
	}
	
	public static void foo(int a, double b, String c) {
		System.out.println(a + b + c); // 62.5caramel
	}
	
	public static void bar() {
		
	}
}
