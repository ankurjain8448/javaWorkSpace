package Sorting_Trchniques;

public class BubbleSort {

	
	public static void main(String[] args) {
	Bubble();

	}
	
	static void Bubble()
	{
		int a[] = {30,20,10,8,4};
		for(int i=0;i<4;i++)
		{
			for(int j = 0;j<4;j++ )
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
					
			}
		}
		for(int i =0;i<5;i++)
			System.out.println(a[i]);
		
	}

}
