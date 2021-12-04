package methods;

public class GrabDataFromMethod {

	public static void main(String[] args) {
		foo(3);
//		int val = bar();
//		System.out.println(val); // 49
		System.out.println(bar());

	}
	
	public static void foo(int a) {
		if(a < 5) {
			return;
		}
		System.out.println(a);
	}
	
	public static int bar() {
		return 49;
	}

}
