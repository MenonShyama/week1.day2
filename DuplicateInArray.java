package week1.day2;

public class DuplicateInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		// int length = arr.length;
		int count;
		for (int i = 0; i <= arr.length - 1; i++) {
			count = 1;
			// System.out.println(arr[i]);
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(arr[i]);

			}
		}

	}

}
