package arrayExamples;

public class FindAsciValue {

	public static void main(String[] args) {
		int [] arr1 = { 11, 12, 13, 14, 15 };
		int [] arr2 = { 6, 7, 8, 5, 6 };
		
		for(int i = 0;i<arr1.length;i++)
		{
			int temp = arr1[i] * arr2[i];
			
			char ch = (char) temp;
			
			System.out.println(arr1[i]+" * "+arr2[i]+" = "+ temp+" ASCI Value: "+ch);
		}	
	}
}
