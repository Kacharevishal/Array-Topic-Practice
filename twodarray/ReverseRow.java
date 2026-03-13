package com.twodarray;

public class ReverseRow {

	public static void main(String[] args) {

		int arr[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i = 0;i< arr.length;i++)
		{
			for(int j = arr.length-1;j>=0;j--)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
