package practice20;

public class FindThirdHighestNo {

	public static void main(String[] args) {

		int[] arr = {10,20,40,30,60,50,70,90,80};
		int max = 0;
		int secondMax = 0;
		int thirdMax = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i] > secondMax && arr[i] != max)
			{
				thirdMax = secondMax;
				secondMax =arr[i];
			}
			else if(arr[i] > thirdMax && arr[i] != secondMax)
			{
				thirdMax = arr[i];
			}
		}
		System.out.println("ThirdMax Number in Given ArrayL: "+thirdMax);

	}

}
