package telran.employee.model;

public class Employee {
	private int id; // поля ,это характеристики обьекта
	private String name;
	private double salary;

	private double netAllowance;

	public Employee(int id/* это аргументы */, String name, double salary, double netAllowance) {// это конструктор
		if (id >= 0) {
			this.id = id;
		}
		this.id = id;
		this.name = name;
//		this.salary = salary;
		setSalary(salary);
//		this.netAllowance = netAllowance;
		setNetAllowance(netAllowance);
	}// для генерации сразу правой кнопкой мышки source - Generate constructor
		// using...
//	public Employee(int id, String name, double salary, double netAllowance){ // вместо ручного воода данных. другой вараинт.
//		this.id = id; // когда я вызываю джона то в качестве зиса будет джон.
//		this.name=name;
//		this.salary=salary;
//		this.netAllowance=netAllowance;
//	}

	public double taxIsrael() {
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

	//////////////////////////////
	///////// SETTERR-GETTER///////
	//////////////////////////////

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetAllowance() {
		return netAllowance;
	}

	public void setNetAllowance(double netAllowance) {
		if (netAllowance > 0) {
			this.netAllowance = netAllowance;
		}
	}

	public int getId() {
		return id;
	}

	public double getSAlary() { // геттер
		return salary;
	}

	public double netSalary() { // сеттер
		return salary - taxIsrael();
	}

	public void setSalary(double salary) {
		if (salary < 0) {
			this.salary = salary;
		}

	}

	public void display() {
		System.out.println("ID: " + id + ", Name:" + name + ", Salary:" + salary + ", Tax allowance:" + netAllowance);
	}

	public void showSalary() {
		System.out.println(" З.П. после вычита налогов: " + netSalary() + " Налог: " + taxIsrael());
	}
}
