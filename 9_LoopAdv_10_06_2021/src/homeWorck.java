
public class homeWorck {

	public static void main(String[] args) {
		int num = 12345;
		int odd = oddDigits(num);
		int even = evenDigits(num);
		System.out.println("Sum odd digits = " + odd);
		System.out.println("Sum even digits = " + even);

	}

	public static int oddDigits(int num) {
		int res = 0;
		while (num > 0) {
			res += num % 10;
			num /= 100;
		}
		return res;
	}

	public static int evenDigits(int num) {
		int res = 0;
		while (num > 0) {
			num /= 10;
			res += num % 10;
			num /= 10;

		}
		return res;
	}
}
