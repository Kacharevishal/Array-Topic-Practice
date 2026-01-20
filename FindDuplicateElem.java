package practice20;

public class FindDuplicateElem {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 3, 10, 2, 2, 4, 4, 6, 6 };
		

		for(int i = 0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
