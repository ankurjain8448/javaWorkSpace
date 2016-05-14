package apply;
import java.util.Scanner;
public class Permute {
	
	int lim;
	char A[];
	
	public static void main(String[] args)
	{
	int limit;
	String Sr=new String();
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the String to be permuted(less then 20 characters else you would not be able to check your result.....:P):\n");
	Sr=S.nextLine();
	limit=Sr.length();
		char str[]=new char[];
		str=Sr.toCharArray();
	Permute p=new Permute(limit,str);
	p.run(str,0,p.left,100);
	}
	Permute(int lim,char arr[])
	{
		this.A=new char[20];
		this.A=arr;
		this.lim=lim;
		

	}
	
	void run(char[] S,int n,int[] left,int last)
	{   
		char sol[]=new sol[20];
		sol=
		
		int i=0,j=0;
		if(last<lim)
			left=delete(left,last,n);
		n++;
		if(n<lim)
		{
			for(i=0;i<lim;i++)
			{
		
				for(j=0;j<lim-n;j++)
				{
					if(i==left[j])
					{
						S[n]=A[i];
						run(S,n+1,left,j);
					}	
				}
				
			}
		}
		
		else System.out.println("---->   "+S.toString());
	}
	
	int[] delete(int left[],int x,int n)
	{
		int i=0;
		for(i=x;i<lim-n-1;i++)
		left[i]=left[i+1];
		
		
		return left;
	}
	
	
}
