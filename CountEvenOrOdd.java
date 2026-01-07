package arrayExamples;

import java.util.Scanner;

public class CountEvenOrOdd {

	public static void main(String[] args) {

		int evenCount = 0;
		int oddCount = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size of Array: ");
		int size = scan.nextInt();
		
		System.out.println("Enter The "+size+" Values ");
		int arr[] = new int[size];
		
		for(int i =0;i<size;i++)
		{
			arr[i] = scan.nextInt();
			if(arr[i] % 2 ==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}		
		}
		System.out.println("Even Number Count: "+evenCount);
		System.out.println("Odd Number Count: "+oddCount);
		scan.close();
	}

}
