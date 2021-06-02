
public class HomeWork2 { // Поиск минимального числа с помощью нахождения максимального

	public static void main(String[] args) {
		double value = min(8, 7);
		System.out.println(value);
	}

	public static double max(double x, double y) {
		return x > y ? x : y;
	}

	public static double min(double x, double y) {
		return x + y - max(x, y);
	}

}

