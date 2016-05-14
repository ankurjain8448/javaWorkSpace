package Sorting_Techniques;

public class Selection_Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,4,7,8,9,0,3,2,1};
		int len= a.length;
		int min = 0;
		int minLoc = 0;
		for(int pass = 0;pass<len-1;pass++){
			
			min = a[pass];
			minLoc=pass;
			
			for(int i = pass+1;i<len;i++)
			{
				
				if(min>a[i]) 
				{
					min = a[i];
					minLoc=i;
				}
				
			}
			int temp = a[pass];
			a[pass] = a[minLoc];
			a[minLoc] = temp;
		}
		
		
		for(int i =0;i<len;i++)
		{
			System.out.println(a[i]);
		}

	}

}
