package Sorting_Trchniques;

import DSA.HeapDSA;

public class Heap_Sort extends HeapDSA {
	public static void main(String[] args) {
		HeapSort();
	}
	
	static void HeapSort()
	{
		for(int i =0;i<19;i++) System.out.print(a[i]+"->");
		
		max_heap();
		
		for(int i = heap_Size;i>0;i--)
		{
			swap(0,i-1);
			heap_Size = heap_Size -1;
			Max_Heapify(0);
		}
		
		System.out.println(" ");
		
		for(int i =0;i<19;i++) System.out.print(a[i]+"->");
	}
	
}