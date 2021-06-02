
public class ifElseAppl {

	public static void main(String[] args) {
		int height = 177;
		if (height > 192) {
			System.out.println("I am very tall");

		}else {
			System.out.println("I am ordinary");
		}
		System.out.println("My heigth is = " + height);
		boolean check = checkArmy(23);
		if(check) {
			System.out.println("Go to army");
		}else {
			System.out.println("Go rest");
		}
		double abs = abs(8);
		System.out.println("abs = " +abs);
		double res = min(5,6);
		System.out.println("min = " +res);
		double sign = sign(5);
		System.out.println("sign = " +sign);
	}
	
		public static int sign(double x) { //znak chisla

			if (x>0) {
				return 1;
			}
			if (x<0) {
				return -1;
			}
			return 0;
		}
		public static double min(double x, double y) {

			if (x<y) {
				return x;
			}else {
				return y;
			}

	}
		public static double abs(double x) {
			
			if (x>0) {
				return x;
			}else {
				return -x;
			}
		}
		public static boolean checkArmy(int age) {
		return 18 <= age && age < 45;
		}
}
