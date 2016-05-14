package Sorting_Techniques;

public class Insertion_Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,6,5,4};
		int len = a.length;
		
		for(int k = 1;k<len;k++)
		{int copyk = k;
			for(int i = k-1;i>=0;i--)
			{
				if(a[i]>a[copyk])
				{
					int temp = a[copyk];
					a[copyk] = a[i];
					a[i] = temp;
					copyk--;
				}
			}
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
