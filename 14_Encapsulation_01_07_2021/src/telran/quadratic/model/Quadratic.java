package telran.quadratic.model;

public class Quadratic {
	/* ���� start */
	private int a;
	private int b;
	private int c;

	/* ���� stop */
	/* ����������� start */
	public Quadratic(int a, int b, int c) {
		setA(a);
		this.b = b;
		this.c = c;
	}

	/* ����������� stop */
	/* setters-getters start */
	public int getA() {
		return a;
	}

	public void setA(int a) {
		if (a > 0) {
			this.a = a;
		}
	}

	/* setters-getters stop */
	/* body start */
	public void display() {
		double D = b * b - (4 * a * c);
		double X = Math.sqrt(D);
		
		if (D < 0) {
			System.out.println("��� �����");
		}else if (D == 0) {
			double x1 = (-b + X) / 2*a;	
			System.out.println("������������: "+ D + " ������: " + x1);
		}else {
			double x1 = (-b + X) / 2*a;	
			double x2 = (-b - X) / 2*a;
			System.out.println("������������: "+ D + " �����: " + x1 + " �: "+ x2);
		}
	}

	/* body stop */
}
