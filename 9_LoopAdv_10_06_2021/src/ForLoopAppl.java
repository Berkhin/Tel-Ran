
public class ForLoopAppl {

	public static void main(String[] args) {
		// for(init инициализация; condition условие; operation операция )
		haharin();
		printStars(37, 5);
		int sum = sumDigits(57566);
		System.out.println("Sum digits = " + sum);

	}
	public static void haharin() {
		int counter;
		for (counter = 12345 ; counter > 0 ; counter--) {
			System.out.println(counter);
		}
		System.out.println("Poehali!");
	}

	public static void printStars(int n, int row) {
		for (int x = 1; x <= n; x++) {
			System.out.print("*");
			if (x % row == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	public static int sumDigits(int num) {
		int res;
		for (res = 0 ; num != 0; num /= 10) {
			res += num % 10;
		}		
		return res;
	}
}
