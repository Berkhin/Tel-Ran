public class homeWorck {

	public static void main(String[] args) {
		double Salary = 11000;
		double taxUkraine = taxUkraine(Salary);
		System.out.println("��� ���������� ����� ����������: " + taxUkraine);
		double netSalary = netSalary(Salary);
		System.out.println("������ ����� �������� ����� ������ ����������� ������ ����������: " + netSalary);
	}

	public static double taxUkraine(double Salary) {
		if (Salary <= 1000) {
			return 0;
		} else {
			return (Salary - 1000) * 0.17;
		}
	}

	public static double netSalary(double Salary) {
		if (Salary <= 1000) {
			return Salary;
		} else {
			return Salary - (Salary - 1000) * 0.17;
		}
	}

}