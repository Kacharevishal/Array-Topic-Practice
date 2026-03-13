package com.twodarray;

public class FindMinFromArray {

	public static void main(String[] args) {

		int arr[][] = { { 10, 20, 40 }, { 50, 30, 90 }, { 70, 80, 60 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int l = 0; l < arr.length; l++) {
						if (arr[i][j] < arr[k][l]) {
							int temp = arr[i][j];
							arr[i][j] = arr[k][l];
							arr[k][l] = temp;
						}
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[0][0]);
				break;
			}
			break;
		}

	}

}
