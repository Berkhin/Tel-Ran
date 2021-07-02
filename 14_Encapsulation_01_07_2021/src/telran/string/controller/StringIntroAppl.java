package telran.string.controller; 

public class StringIntroAppl {

	public static void main(String[] args) {
		System.out.println("Hello word!");
		String str = "Hello";
		System.out.println(str);
		str = str + " word!";// конкатинация сложение стринга с новой строкой
		System.out.println(str);
		str = 8 + 1 + "Java" + 8 + 1;
		System.out.println(str); // все подводится под стринговый тип (кроме значение до стринга) не важно что
									// стоит это будет стринг
		greeting("Ukreine!");
		calculator (5, 6, "/");
	}

	public static void greeting(String name) {
		String res = "Viva " + name;
		System.out.println(res);
	}
	public static void calculator(double a, double b, String oper) {
		switch (oper) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;

		default:
			System.out.println("Wrong operation");
			break;
		}
	}
}
