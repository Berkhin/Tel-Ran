
public class NestedLoopAppl {

	public static void main(String[] args) {
//		printStars(10, 10);
		pithagoras (9, 9);
		figure (8);
		figure2 (8);
		
	}

//	public static void printStars(int rows, int cols) {
//		for (int i = 1; i <= rows; i++) {
//			for (int j = 1; j <= cols; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		public static void pithagoras (int rows, int cols) {
			for (int i = 1; i <= rows; i++) {

				for (int j = 1; j <= cols; j++) {
					System.out.print(i * j + "\t");
				}
				System.out.println();
			}
		}
		public static void figure(int n) {
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || i == n || j == 1 || j == n || i==j) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
		public static void figure2(int n) {
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || i == n || j == 1 || j == n || i==j) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}

