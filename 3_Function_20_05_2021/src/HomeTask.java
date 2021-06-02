public class HomeTask {

	public static void main(String[] args) {
		System.out.println("Main start");
		function6();
		function1();
		function2();
		System.out.println("Main finish");
	}

	public static void function1() {
		System.out.println("function1 start");
		function4();
		System.out.println("function1 finish");
	}
	public static void function2() {
		System.out.println("function2 start");
		function6();
		System.out.println("function2 finish");
	}
	public static void function4() {
		System.out.println("function4 start");
		function5();
		System.out.println("function4 finish");
	}
	public static void function5() {
		System.out.println("function5 start");
		function6();
		System.out.println("function5 finish");
	}
	public static void function6() {
		System.out.println("function6 start");
		System.out.println("function6 finish");
	}
	

	
}