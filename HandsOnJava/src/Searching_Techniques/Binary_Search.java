package Searching_Techniques;

public class Binary_Search {
	public static void main(String[] args) {
		
int a[] = {1,2,3,4,5,7,8,9};
int beg = 0;
int n = 6;//number to be searched
int end =a.length-1;
int mid = (beg+end)/2;
System.out.println("beg : "+beg+"\nmid : "+mid+"\nend : "+end);
 binary(a,beg,mid,end,n);
 
	}
	
	static void binary(int a[],int beg,int mid,int end,int n)
	{
		if(n==a[mid])
		{
			System.out.println("number exists");
			System.exit(0);
		}
		if(beg>end)
		{
			System.out.println("number not exist");
			System.exit(0);
		}
		
		
		if(n>a[mid])
		{
			beg = mid+1;
			mid = (beg+end)/2;			
			binary(a,beg,mid,end,n);
		}
		
		
		if(n<a[mid])
		{			
			end = mid-1;
			mid = (beg+end)/2;
			binary(a,beg,mid,end,n);
			
		}
		
	}

}
