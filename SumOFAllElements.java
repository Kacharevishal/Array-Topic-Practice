package arrayExamples;

import java.util.Scanner;

public class SumOFAllElements {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size of Array: ");
		int size = scan.nextInt();
		
		System.out.println("Enter The "+size+" Values: ");
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.print("\nThis is The Array: ");
		for(int temp : arr)
		{
			System.out.print(temp+" ");
			sum+=temp;
		}
		System.out.println("\nSum Of All Values: "+sum);
		scan.close();
	}

}
