package arrayExamples;

import java.util.Scanner;

public class FindMaxNo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Size of Array: ");
		int size = scan.nextInt();
		
		System.out.println("Enter The "+size+" Values: ");
		int arr[]= new int[size];
		int max = arr[0];
		
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
			if(max < arr[i])
			{
				max = arr[i];
			}
		}

		System.out.println("This is The Given Array: ");
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("\nMax Value From Given Array: "+max);
		
		scan.close();

	}

}
