
public class homeWorck {

	public static void main(String[] args) {

		double pow = powPositive(6, -5);
		System.out.println(pow);
		printStars(35, 5);
	}

	public static void printStars(int n, int x) {
		int a = n;
		while (a > 0) {
			if ((n - a) % x != 0) {
				System.out.print("*");
			} else {
				System.out.println();
				System.out.print("*");
			}
			a--;
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
