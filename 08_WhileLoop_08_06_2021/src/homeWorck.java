
public class homeWorck {

	public static void main(String[] args) {

		double pow = powPositive(6, -5);
		System.out.println(pow);
		printStars(35, 5);
	}

	public static void printStars(int n, int x) {
		while (n >= 1) {
			System.out.print("*");
			if (n % x == 0) {
				System.out.println();
			}
			n--;
		}

	}

	public static double powPositive(double x, int n) {
		double res = 1;
		if (n < 0) {
			while (n < 0) {
				res = res / x;
				n++;
			}
		} else {
			while (n > 0) {
				res = res * x;
				n--;
			}
		}
		return res;

	}
}

