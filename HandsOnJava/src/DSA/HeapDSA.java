package DSA;


/*
 *  insertion in heap
 * Searching in heap
 * find max and min
 * Deletion in heap 
 * 
 * */

public class HeapDSA {
	protected static int a[] = {4,11,22,13,54,45,36,27,81,23,44,12,455,656,434,234,213,121,2323}; //10
	protected static int heap_Size =19;
	protected static int l,r,largest;
	
	public static void main(String[] args) {
	

	}

	protected static void Max_Heapify(int i)
	{
		l = left(i); 
		r = right(i);
		if(((l<heap_Size ))&&(a[l]>a[i]) ) largest = l;
		else largest = i;
		if(((r<heap_Size ))&&(a[r]>a[largest])) largest = r;
		if(largest!=i)
		{
			swap(largest,i);
			Max_Heapify(largest);
		}
	}
	
	protected static void swap(int i,int j)//i and j are index in array
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	protected static void max_heap()
	{
		for(int i=heap_Size/2;i>=0;i--)
		{
			Max_Heapify(i);
		}
	}
	
	static int left(int i)
	{
		return ((2*i)+1);
	}
	
	static int right(int i)
	{
		return ((2*i)+2);
	}
}
