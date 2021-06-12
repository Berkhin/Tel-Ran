
public class homeWork {

	public static void main(String[] args) {
		int num = 222222;
		boolean lucky = luckyNumber(num);
		if (lucky) {
			System.out.println("Lucky");
		} else {
			System.out.println("not Lucky");
		}

	}

	public static boolean luckyNumber(int num) {
		int odd;
		int even;
		for (odd = 0, even = 0; (num > 0); odd += num % 10, num /= 10, even += num % 10, num /= 10) {

		}
		return odd == even;
	}

}
