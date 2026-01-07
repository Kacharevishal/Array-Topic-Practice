package arrayExamples;

public class SearchAnElement {

	public static void main(String[] args) {

		int num = 1;
		
		int[] arr = {100,20,60,40,10};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == num)
			{
				System.out.println(num+": Number is Present in the Array...");
			}
		}
	}
}
