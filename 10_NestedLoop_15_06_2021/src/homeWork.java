//	public static boolean luckyNumber(int num) {
//		int sum = 0;
//		while (num != 0) {
//			sum = num % 10 - sum;
//			num /= 10;
//		}
//		return sum == 0;
//	}
//1. ������� ������� � ��������� ���������� � ��������� �� ����� ����������
//2. ��������� ��������� ���������� ��� �� ��������� 0.
//3. ��������� ���� � �������� ��� ������ ���� ���������� ��� �� ������ ����� ���� ���� ����� ��������.
//4. � ���� ����� ����� ������� ��� ����� (���������������) ��� ����� ������� �� ������� (����.�-� �������� ��������) �������������� ��� ����� ��� �������� ������� ����� �������� �� ������� ������������������� ���. 
//5. ��� ������� �� 10 ��� ����� ������ ������� ����� ������.
//6. ��� ��� ������� ���������� �������� ��� ������ � ���� ��� � ���� � ����������� �� ������� ����� �� ��� ����� 0 ��� ���.
//7. � ����� ������� ������� ��� ��������� �� ������� ���� ���� � ����� ������ ���� ��� ���.
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
