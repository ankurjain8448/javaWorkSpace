package Sorting_Trchniques;

public class SelectionSort {

	
	public static void main(String[] args) {
	
		Select();
	}
	static void Select()
	{
		
		int a[]= {5,4,30,2,1};
		
		int index = 0;
		for(int i =0;i<4;i++)
		{
			int min = a[i];
			for(int j =i;j<=4;j++)
			{
				if(min >=a[j])
				{
					min = a[j];
					index = j;
				}
			}
			int temp = a[i];
			a[i] = min;
			a[index] = temp;
			
		
		}
		for(int i1 = 0;i1<5;i1++)
			System.out.println(a[i1]);
	}

}
