package arrayExamples;

import java.util.Scanner;

public class AverateOfElem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size of Array: ");
		int size = scan.nextInt();
		
		System.out.println("Enter The "+size+" Values: ");
		int arr[]= new int[size];
		int sum = 0;
		
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.print("\nThis is The Array: ");
		for(int temp : arr)
		{
			System.out.print(temp+" ");
			sum +=temp;
			
		}
		int avg = sum/size;
		
		System.out.println("\nAverage Of All Values: "+avg);
		
		scan.close();

	}

}
