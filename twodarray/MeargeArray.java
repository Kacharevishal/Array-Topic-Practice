package com.twodarray;

public class MeargeArray {

	public static void main(String[] args) {

		int arr1[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int arr2[][] = {{40,50,60},{70,80,90},{10,20,30}};
		int arr3[][] = new int[arr1.length+arr2.length][arr2.length+arr1.length];
		
		for(int i = 0;i<arr1.length;i++)
		{
			for(int j = 0;j<arr2.length;j++)
			{
				arr3[i][j] += arr1[i][j];
				arr3[i+arr1.length][j+arr1.length] += arr1[i][j];
			}
		}
	}

}
