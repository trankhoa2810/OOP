package buoi1;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		readArray(a, n);
		int x = sc.nextInt();
		int count = coutX(a, x);
		System.out.println(count);
		sortArray(a, n);
		printArray(a, n);
	}
	
	public static void readArray(int[] A, int n)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++)
		{
			A[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] A, int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(A[i] + " ");
		}
	}
	
	public static int coutX(int[] A, int x)
	{
		int count = 0;
		for(int i = 0; i < A.length; i++)
		{
			if(A[i] == x)
				count++;
		}
		return count;
	}
	
	public static void sortArray(int[] A, int n)
	{
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(A[i] > A[j])
				{
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;		
				}
			}
		}
	}
}