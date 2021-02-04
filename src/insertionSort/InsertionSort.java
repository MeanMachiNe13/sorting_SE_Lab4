package insertionSort;
import java.util.Scanner;

public class InsertionSort {
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
		for (int i = 1; i < n; i += 1) 
        { 
            int key = array[i]; 
            int j = i - 1; 
            while (j >= 0 && array[j] > key)
            { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        }
		System.out.println("\nSorted Array");
		for(int i = 0; i < n; i+= 1)
		{
			System.out.print(array[i] + " ");
		}
	}
}
