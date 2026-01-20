package practice20;

public class RemovDublicElem {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 10, 40, 20, 50 };

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
				{
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate == false) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
