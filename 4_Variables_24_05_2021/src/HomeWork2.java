
public class HomeWork2 { // ����� ������������ ����� � ������� ���������� �������������

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

