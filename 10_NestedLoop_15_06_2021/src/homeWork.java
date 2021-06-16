//	public static boolean luckyNumber(int num) {
//		int sum = 0;
//		while (num != 0) {
//			sum = num % 10 - sum;
//			num /= 10;
//		}
//		return sum == 0;
//	}
//1. создаем функцию с названием лакинамбер и значением из мэйна переменной
//2. обьявляем локальную переменную сум со значением 0.
//3. обьявляем цикл с условием его работы пока переменная нум не станет равна нулю цикл будет работать.
//4. в теле цикла пишем условие что новый (переопределится) сум равен остаток от деления (хххх.х-х является остатком) перезаписывает сум давая ему значение остатка потом отнимает от остатка допереопределненный сум. 
//5. нум делится на 10 тем самым удаляя крайнее число справа.
//6. так как функция буленговая ретерном она вернет в мэин тру о фолс с завмисимоти от условия будет ли сум равно 0 или нет.
//7. в итоге функция выводит нам ровняется ли разница всех цифр в числе равной нулю или нет.

public class homeWork {

	public static void main(String[] args) {
		figure(15);
		figure2(15);
		figure3(15);
		figure4(8);

	}

	public static void figure(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	public static void figure2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j || i == n - j + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void figure3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j || i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}
		System.out.println("");
	}

	public static void figure4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1|| j == n|| j==i|| i == n - j + 1 || n/2>=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" " +i);
		}
	}

}
