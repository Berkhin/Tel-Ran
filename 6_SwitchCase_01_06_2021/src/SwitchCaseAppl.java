
public class SwitchCaseAppl {

	public static void main(String[] args) {
		fan(1);
		fan1(2);
		fan2(1);
		double res = calculator (4, 5, 1);
		System.out.println("Resault = " +res);
		vaht(7);

	}

	public static void fan(int mode) {
		if (mode == 0) {
			System.out.println("off");
		} else if (mode == 1) {
			System.out.println("slow");
		} else {
			if (mode == 2) {
				System.out.println("medium");
			} else {
				if (mode == 3) {
					System.out.println("fast");
				} else {
					System.out.println("Wrong mode");
				}
			}
		}
	}

	public static void fan1(int mode) {
		if (mode == 0) {
			System.out.println("off");
		}
		if (mode == 1) {
			System.out.println("slow");
		}
		if (mode == 2) {
			System.out.println("medium");
		}
		if (mode == 3) {
			System.out.println("fast");
		}
		if (mode < 0 || mode > 3) {
			System.out.println("Wrong mode");
		}
	}

	public static void fan2(int mode) {
		switch (mode) {
		case 0:
			System.out.println("off");
			break;
		case 1:
			System.out.println("Slow");
			break;
		case 2:
			System.out.println("Medium");
			break;
		case 3:
			System.out.println("Fast");
			break;
		default:
			System.out.println("Wrong mode");
		}
	}
	
	public static double calculator(double a, double b, int oper) {
		switch (oper) {
		case 1:
			return a + b;
		case 2:
			return a - b;
		case 3:
			return a * b;
		case 4:
			return a / b;
		default:
			return 0;
		}
	}
	
	public static void vaht(int x) {
		if (x < 1 || x > 52) {
			System.out.println("wrong week");
		}
		switch (x % 4) {
		case 1:
			System.out.println("john");
			break;
		case 2:
			System.out.println("Peter");
			break;
		case 3:
			System.out.println("Mary");
			break;
		case 0:
			System.out.println("Tigran");
			break;
		}
	}
	

}
