package telran.employee.model;

public class Employee {
	public int id; // поля
	public String name;
	public double salary;
	public double netAllowance;

	public double netSalary(double salary, double netAllowance) {
		return salary - taxIsrael(salary, netAllowance);
	}

	public double taxIsrael(double salary, double netAllowance) {
		double[] allIndex = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5 };
		double[] allBorder = { 0, 6330, 9080, 14580, 20260, 42160, 54300 };
		double tax = -(netAllowance * 219);
		for (int i = 0; i <= allBorder.length; i++) {
			if (i == allBorder.length - 1) {
				double res = tax + (salary - allBorder[allBorder.length - 1]) * allIndex[allIndex.length - 1];// -
																												// index;
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

	public void display() {
		System.out.println("ID: " + id + ", Name:" + name + ", Salary:" + salary + ", Tax allowance:" + netAllowance);
	}

	public void showSalary() {
		System.out.println(netSalary(salary, netAllowance) + " Налог: " + (salary - netSalary(salary, netAllowance)));
	}
}
