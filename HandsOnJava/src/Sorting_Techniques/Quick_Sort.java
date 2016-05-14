package Sorting_Techniques;
import java.util.*;

public class Quick_Sort {
Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = {9,8,7,3,16,9,5,14,3,2,11};
		
		int len = a.length;
		quick(a,0,len-1);
		
		for(int i=0;i<len;i++ ) System.out.println(a[i]);

	}

	
	public static void quick(int a[],int x,int y)
	{
		if(x>=y) return;
		
		int pivot = a[x];
		int i = x+1;
		int j = y;
		while(i<j)
		{
				while(i<j && pivot>=a[i]){ i++;}
			
				while(i<j && pivot<=a[j]){ j--;}
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
		}
	
		if(a[j]>pivot) {j--;}
			int item = a[x];
			a[x] = a[j];
			a[j] = item;
		quick(a,x,j-1);
		quick(a,j+1,y);
	}
}
