package Sorting_Techniques;

public class Bubble_Sort {

	
	public static void main(String[] args) {
	
		int a[] = {5,4,3,7,8,0,9,1};
		int l = a.length;
		
		int pass = l-1;
		for(int p =0;p<pass;p++)
		{  int i=0;
			for(int j =1;j<l;j++)
			{   
			   
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
				}
				else i++;
				
			}
		}
		for(int i = 0;i<a.length;i++)
		System.out.println(a[i]);
		
		
	}

	
	

}
