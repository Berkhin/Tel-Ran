
public class StackAppl {

	public static void main(String[] args) {
		System.out.println("Main start");
		function1();
		System.out.println("Main finish");
	}

	public static void function1() {
		System.out.println("function1 start");
		function2();
		System.out.println("function1 finish");
	}

	public static void function2() {
		System.out.println("function2 start");
		function3();
		System.out.println("function2 finish");
	}

	public static void function3() {
		System.out.println("function3 start");
		function4();
		System.out.println("function3 finish");
	}

	public static void function4() {
		System.out.println("function4 start");
		System.out.println("function4 finish");

	}

}