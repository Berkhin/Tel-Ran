
public class HomeTask {

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray(arr, 10, 99);
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
		int src = search(arr, 25);
		System.out.println();
		System.out.println(src);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
	}

	private static void fillArray(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random() * (max - min + 1));
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					arr[i] = arr[i] + arr[i + 1];
					arr[i + 1] = arr[i] - arr[i + 1];
					arr[i] = arr[i] - arr[i + 1];
				}
			}
		}
		System.out.println();
	}

	public static int search(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == value) {
				return mid;
			}
			if (arr[mid] < value) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		if (value < arr[0]) {
			return -1;
		} else {
			return -(r + 2);
		}
	}
}
