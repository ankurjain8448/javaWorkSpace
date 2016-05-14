package Sorting_Trchniques;

public class Merge_Sort extends a {
	public static void main(String[] args) {
		
		call();

	}

}

class a
{
static int a[] = {10,9,8,7,6,5,4};
static	int beg=0;
static int end = 6;
	static void  call()
	{
		for(int i = beg;i<end+1;i++) System.out.print(a[i]+"->");
		
		MergeSort(0,6);
		
		System.out.println(" ");
		for(int i = beg;i<end+1;i++) System.out.print(a[i]+"->");
	}
	static void MergeSort(int beg,int end)
	{
		int mid = (beg+end)/2;
		
		if(beg<end)
		{
			System.out.println("beg : "+beg);
			System.out.println("mid : "+mid);
			System.out.println("end : "+end);
			System.out.println(" ");
			MergeSort(beg,mid);
			MergeSort(mid+1,end);
			Merge(beg,mid,end);
		}
	}
	
	static void Merge(int l,int m,int r)
	{
			int i, j, k;
		    int n1 = m - l + 1;
		    int n2 =  r - m;
		 
		    /* create temp arrays */
		    int L[] = new int[n1];
		    int	R[] = new int[n2];
		 
		    /* Copy data to temp arrays L[] and R[] */
		    for(i = 0; i < n1; i++)
		        L[i] = a[l + i];
		    for(j = 0; j < n2; j++)
		        R[j] = a[m + 1+ j];
		 
		    /* Merge the temp arrays back into arr[l..r]*/
		    i = 0;
		    j = 0;
		    k = l;
		    while (i < n1 && j < n2)
		    {   int temp;
		        if (L[i] <= R[j])
		        {    temp = a[k];
		            a[k] = L[i];
		            a[r] = temp;
		            i++;
		        }
		        else
		        {
		        	 temp = a[k];
		        	 a[k] = R[j];    
			            a[r] = temp;
			             j++;
		        }
		      
		        k++;
		    }
		 
		    /*Copy the remaining elements of L[], if there are any */
		    while (i < n1)
		    {
		        a[k] = L[i];
		        i++;
		        k++;
		    }
		 
		    /* Copy the remaining elements of R[], if there are any */
		    while (j < n2)
		    {
		        a[k] = R[j];
		        j++;
		        k++;
		    }
	}
}