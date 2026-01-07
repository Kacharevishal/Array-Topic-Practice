package arrayExamples;

import java.util.Scanner;

public class CreateAndPrint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Size of Array: ");
		int arrSize = scan.nextInt();
		System.out.println("Enter The "+arrSize+" Values: ");
		
		int arr[] = new int[arrSize];
		
		for(int i = 0;i<arrSize;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("This is a Final Array: ");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		scan.close();
	}
}
