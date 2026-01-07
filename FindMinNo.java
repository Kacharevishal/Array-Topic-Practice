package arrayExamples;

import java.util.Scanner;

public class FindMinNo {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Size of Array: ");
		int size = scan.nextInt();
		
		System.out.println("Enter The "+size+" Values: ");
		int arr[]= new int[size];
		
		arr[0] = scan.nextInt();
		int min =arr[0];
		for(int i=1;i<size;i++)
		{
			arr[i] = scan.nextInt();
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}

		System.out.println("This is The Given Array: ");
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("\nMin Value From Given Array: "+min);
		
		scan.close();
	}

}
