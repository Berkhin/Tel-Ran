
public class homeWork {

	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 7, 11, 13, 17, 19 };
		System.out.print("before = ");	
		int x = array[0];
		printReverseArray(array, x);
		
	}

	public static void printReverseArray(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.print("into = ");
		for (int i = array.length - 1; i >= 0; i--) {		
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.print("after = ");
		for (int i = array.length - 1; i >= 0; i--) {
			
			System.out.print(array[i] + "\t");
			
		}
		for (int i = 0; i < array.length / 2; i++) {
            int revers = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = revers;
        }
		System.out.println();
		System.out.print(array[0] + "\t");
	}
}
