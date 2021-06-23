
public class TaxIsraelFor {

	public static void main(String[] args) {
		double[] allIndex = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5 };
		double[] allBorder = { 0, 6330, 9080, 14580, 20260, 42160, 54300 };
		double netSalary = netSalary(45000, 5.25, allIndex, allBorder);
		System.out.println("Net = " + netSalary);
	}

	public static double netSalary(double salary, double netAllowance, double[] allIndex, double[] allBorder) {

		return salary - taxIsrael(salary, netAllowance, allIndex, allBorder);
	}

	public static double taxIsrael(double salary, double netAllowance, double[] allIndex, double[] allBorder) {
		double tax = -(netAllowance * 219);
		for (int i = 0; i <= allBorder.length; i++) {
			if (salary > allBorder.length && i == allBorder.length - 1) {
				double res = tax + (salary - 54300) * 0.5;// - index;
				return res > 0 ? res : 0;
			} else if (salary >= allBorder[i] && salary < allBorder[i + 1]) {
				double res = tax + (salary - allBorder[i]) * allIndex[i];// - index;
				return res > 0 ? res : 0;
			} else {
				tax = tax + (allBorder[i + 1] - allBorder[i]) * allIndex[i];
			}
		}

		return tax;

	}
}
