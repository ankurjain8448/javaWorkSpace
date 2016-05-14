import java.util.*;
public class Quick {
	static Scanner in = new Scanner(System.in);
	static int pivot;
	static int n,p,q;
	static int[] a = new int[n];
	public static void main(String[] args) {
	
		System.out.println("Enter the size of array : ");
		n = in.nextInt();
		
		System.out.println("Enter any array to be sorted");
		for(int i =0;i<n;i++)	a[i] = in.nextInt();
		
		pivot = 0;
		p = 1;
		q = n-1;
		Quicksort(a,0,n-1);
		
	}
	
	static void Quicksort(int a[],int lb,int ub)
	{
		while(q>p)
		{
		while(p<a[pivot])
		p++;
		
		while(q>a[pivot])
		q--;
		
		swap(a[p],a[q]);
		}
		
		if(q<=p) 
		{
		swap(a[pivot],a[q-1]);
		Quicksort(a,lb,q-1);
		Quicksort(a,q+1,ub);
		}
	}
	
	static void swap(int a , int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

}
