
public class FunctionAdvAppl {

	public static void main(String[] args) {
	double res;
	res = pi();
	System.out.println(res);
	double r = 5;
	res = circleLength(r);
	System.out.println(res);
	res = max(5, 6);
	System.out.println(res);
	res= abs(-9);
	System.out.println(res);

	}
	
	public static double /* void funkcia nichego ne vozrashaet; double vozvrashaet*/ pi () {
		double res = 3.1415926;
		return res;
	}
	public static double circleLength (double radius) {
		double len =  2 * pi() * radius;
		return len;
}
	public static double max(double x, double y) {
		double res = x > y ? x : y;
		return res;
	}
	public static double abs(double x) {
		return x > 0 ? x : -x;
	}
}
