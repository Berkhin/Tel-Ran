
public class ArrayAppl {

	public static void main(String[] args) {
		int[] arr = new int[5];// 5 nulei
		System.out.println(arr[3]);
		arr[2] = 100500;
		System.out.println(arr[2]);
		arr[1] = arr[2] * 2;
		System.out.println(arr[1]);
		System.out.println(arr.length);// dlinna massiva
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 };
		System.out.println(primes.length);
		System.out.println(primes[2]);
		primes[2] = -1;
		System.out.println(primes[2]);
		int i = 4;
		System.out.println(primes[i]);// vivel 4 element is massiva
		i++;
		System.out.println(primes[i]); // vivel 5 elemnt massiva
		printArray(primes);
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("[" + i + "] = " + arr[i]);
		}
	}

}
