package telran.quadratic.model;

public class Quadratic {
	/* поля start */
	private double a;
	private double b;
	private double c;

	/* поля stop */
	/* конструктор start */
	public Quadratic(int a, int b, int c) {
		setA(a);
		this.b = b;
		this.c = c;
	}

	/* конструктор stop */
	/* setters-getters start */
	public double getA() {
		return a;
	}

	public void setA(int a) {
		if (a != 0) {
			this.a = a;
		}
	}

	/* setters-getters stop */
	/* body start */
	public void display() {
		double D = b * b - (4 * a * c);
		double X = Math.sqrt(D);
		
		if (D < 0) {
			System.out.println("Нет корня");
		}else if (D == 0) {
			double x1 = (-b + X) / 2*a;	
			System.out.println("Дискриминант: "+ D + " Корень: " + x1);
		}else {
			double x1 = (-b + X) / 2*a;	
			double x2 = (-b - X) / 2*a;
			System.out.println("Дискриминант: "+ D + " Корни: " + x1 + " И: "+ x2);
		}
	}

	/* body stop */
}
