package bubbleSort;
import java.util.*;

public class BubbleSort {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int n = cin.nextInt();
		int array[] = new int[n];
		System.out.println("Enter elemements of array");
		for(int i = 0; i < n; i+= 1)
		{
			array[i] = cin.nextInt();
		}	
		System.out.println("Unsorted Array");
		for(int i = 0; i < n; i+= 1)
		{
			System.out.print(array[i] + " ");
		}	
		for(int i = 0; i < n; i+= 1)
		{	
			for(int j = 0; j < n - i - 1; j += 1)
			{
				if (array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("\nSorted Array");
		for(int i = 0; i < n; i+= 1)
		{
			System.out.print(array[i] + " ");
		}
	}
}
