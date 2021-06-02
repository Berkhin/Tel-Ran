public class HomeWork3 { // Поиск минимального числа с помощью нахождения модуля

	public static void main(String[] args) {
		double value = min(-6, 7);
		System.out.println(value);
	}

	public static double min(double x, double y) {
		double value = x - y;
		return (x + y - abs(value)) / 2;

	}

	public static double abs(double x) {
		return x > 0 ? x : -x;
	}

}