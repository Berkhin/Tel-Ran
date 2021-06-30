
public class ArrayAdvAppl {

	public static void main(String[] args) {
		int[] arr = new int[10];
		printArray(arr);
		fillArray(arr, 10, 99);
		printArray(arr);
		int sum = sumArray(arr);
		System.out.println(sum);
		double avg = average(arr);
		System.out.println(avg);
		int max = maxArray(arr);
		System.out.println(max);
		int src = search(arr, 55);
		System.out.println(src);
		int min = minArray(arr);
		System.out.println("min = " + min);
		int ind = index0Min(arr);
		System.out.println("index min = " + ind);
		System.out.println("с поправкой на ветер index min = " + (ind+1));
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
	}

	private static void fillArray(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random() * (max - min + 1));// Math.random генерирует случайное число от 0 до 1.
																	// ( 0...0,1...0,2....0,5....0,9)
		}
	}

	public static double average(int[] sum) {
		return 1. * sumArray(sum) / sum.length;

	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int maxArray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static int search(int[] arr, int value) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int minArray(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	public static int index0Min(int[] arr) {
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		return minIndex;
	}

}
