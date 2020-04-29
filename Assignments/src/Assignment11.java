import java.util.*;
public class Assignment11 {
	//defining a variable with boolean data type as false assuming that the number we are searching is not in the list.
	int x;
	boolean flag = false;
	//method to search the number in array
	public void search(int[] a, int n)
	{
		for(int i=0; i<a.length;i++)
		{	
			if(a[i]==n)
			{	//If the number is found in the list, the value of flag will be true.
				
				x=i;
				flag = true;
				break;
			}
			
			
		}
		if(flag==true)
		{
			System.out.println("First repeated Element found at index: "+x);
		}
		//If value of flag remains false, then the number is not found in the list.
		if(flag==false)
		{
			System.out.println("Element not found in the array");
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers in array: ");
		int a[] = new int[6];
		//Storing numbers in array
		for(int i=0; i<6;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to search: ");
		int n;
		//Taking input for searching the number in array
		n = sc.nextInt();
		//Creating object
		Assignment11 object = new Assignment11();
		//Calling method
		object.search(a,n);

	}

}
