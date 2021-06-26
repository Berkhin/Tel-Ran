
public class MergeArrays {

	public static void main(String[] args) {
		int[] ar1 = {-1};
		int[] ar2 = { 6, 6, 6, 6, 6 };
		int[] ar3 = mergeArrays(ar1, ar2);
		for (int i = 0; i < ar3.length; i++) {
			System.out.print(ar3[i] + "\t");
		}
	}
	public static int[] mergeArrays(int[] ar1, int[] ar2) {
		int[] ar3 = new int[ar1.length + ar2.length];
		System.arraycopy(ar1, 0, ar3, 0, ar1.length);
		System.arraycopy(ar2, 0, ar3, ar1.length, ar2.length);
		return ar3;
	}
//	public static int[] mergeArrays(int[] ar1, int[] ar2) {
//		int[] ar3 = new int[ar1.length + ar2.length];
//		for (int i = 0; i < ar1.length; i++) {
//			ar3[i] = ar1[i];
//		}
//		for (int i = 0; i < ar2.length; i++) {
//			ar3[ar1.length + i] = ar2[i];
//		}
//		return ar3;
//
//	}
}