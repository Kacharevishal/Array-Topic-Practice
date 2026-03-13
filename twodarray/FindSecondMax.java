package com.twodarray;

public class FindSecondMax {

	public static void main(String[] args) {

		int arr[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		int max = arr[0][0];
		int secondMax = arr[0][0];
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[i][j] > max)
				{
					secondMax = max;
					max = arr[i][j];
				}
				else if(secondMax > arr[i][j] && secondMax != max)
				{
					secondMax = arr[i][j];
				}
			}
		}
		System.out.println(secondMax);
	}
}
