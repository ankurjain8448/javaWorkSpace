package Sorting_Trchniques;

public class InsertionSort {

	
	public static void main(String[] args) {
	insert();

	}
static void insert()
{
	int a[] = {5,3,7,2,1,20,19,16,15,14,12,100,199,23,56,7,4,6,5,5,5,5,55};
	for(int i =1;i<a.length;i++)
	{
		int j =i;
		while(j>=0 & a[j-1]>a[j])
		{
			int temp = a[j];
			a[j]= a[j-1];
			a[j-1]=temp;
			j--;
			if(j==0) break;
		}
		
		
	}
	
	for(int i =0;i<a.length;i++)
	System.out.println(a[i]);
}
}
