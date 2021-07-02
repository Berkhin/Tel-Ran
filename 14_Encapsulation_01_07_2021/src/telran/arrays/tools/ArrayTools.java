package telran.arrays.tools;

public class ArrayTools {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
	}

	public static void fillArray(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random() * (max - min + 1));// Math.random генерирует случайное число от 0 до 1.
																	// ( 0...0,1...0,2....0,5....0,9)
		}
	}
	
	public static int binarySearch(int[] arr, int value) { //(бинарный поиск)функция поиска в массиве через разбитие участков массива пополам
		
		int l=0;
		int r=arr.length-1;
		while (l<=r) {
			int mid = (l+r)/2;
			if (arr[mid]==value) {
				return mid;
			}
			if (arr[mid]<value) {
				l = mid +1;
			}else {
				r = mid -1;
			}
		}
		return -1;
	}

	
	public static void bubbleSort1(int[] arr) {
		while(bubbling(arr));
		
		
	}
	
	private static boolean bubbling(int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int t = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = t;
				flag = true;
			}
		}	
		return flag;
	}
	
	
	public static void bubbleSort(int[] arr) {   // пузырьковый метод сортировки массива 'bubbleSort'
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}
			}
		}
		System.out.println();
	}
}
