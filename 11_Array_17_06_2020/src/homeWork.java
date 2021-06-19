import java.util.Arrays;

public class homeWork {

	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 7, 11, 13, 17, 19 };

		printReverseArray(array);
		ReverseArray(array);

		double[] allIndex = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5 };
		double[] allBorder = { 0, 6330, 9080, 14580, 20260, 42160, 54300 };
		double netSalary = netSalary(40000, 5.25, allIndex, allBorder);
		System.out.println("Net = " + netSalary);
	}

	public static void printReverseArray(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();

	}

	public static void ReverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int revers = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = revers;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	public static double netSalary(double salary, double netAllowance, double[] allIndex, double[] allBorder) {

		return salary - taxIsrael(salary, netAllowance, allIndex, allBorder);
	}

	public static double taxIsrael(double salary, double netAllowance, double[] allIndex, double[] allBorder) {
		double tax = -(netAllowance * 219);
		for (int i = 0; i < allBorder.length; i++) {
			if (salary >= allBorder[i] && salary < allBorder[i + 1]) {
				double res = tax + (salary - allBorder[i]) * allIndex[i];
				return res > 0 ? res : 0;
			} else {
				tax = tax + ((allBorder[i + 1]) - allBorder[i]) * allIndex[i];
			}
		}

		if (salary < 6330) {
			double res = tax + salary * 0.1;// - index;
			return res > 0 ? res : 0;
		} else {
			tax = tax + 6330 * 0.1;
		}

		double res = tax + (salary - 54300) * 0.5;// - index;
		return res > 0 ? res : 0;

	}
}
