import java.util.Scanner;

public class ZehriUpdated {

	char str[]=new char[20];
	int len;
static long count= 0;
static long e;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				 
		System.out.println("enter any two number  : ");
		
		long n1 =in.nextLong();
		long n2 =in.nextLong();
		
		double start =System.currentTimeMillis();
		int flag =0,flag1=0;
		
	for(e = n1;e<=n2;e++)
	{	
		if(e==0){System.out.println(e);count++;}
		if(e<100000) e = 100000;
		if(e==50000000) e=100025873;
		if(e>499928571&n2<=1000025873) break;
		if(flag ==0)
			{
				if((e>499928571)&&(n2>=1000025873))
				{e=1000025873;
				flag++;}
			}
		if((e>4999928571l)&&(n2<=10000000000l)) break;
		if(flag1 ==0)
			{
				if((e>4999928571l)&&(n2>=10000000000l))
				{e=10000000000l;
				flag1++;}
			}
		
	long p = e ;
	long q = 2*p ;
	long x[] = new long[10];
	long y[] = new long[10];
	while(p>0)
	{
		long m = p%10;
		int n = (int)m;
		p = p/10;
		x[n] = x[n]+1;
	}

	while(q>0)
	{
		long m = q%10;
		int n =(int)m;
		q = q/10;
		y[n] = y[n]+1;
	}
	
	int n=0;
	for(int i =0;i<10;i++)
	{
		if(x[i]!=y[i]) break;
		else n++;				
	}


	if(n==10)
	{
		System.out.println(e);count++;
		
		String word = String.valueOf(e);
		
		int l = word.length();
		char a[] = new char[4];
		for(int i =0;i<4;i++)
		{
			a[i] = word.charAt(l+i-4);
		}
		ZehriUpdated P=new ZehriUpdated(a,4);
		
		P.run(0);

	}
	
	}
		
		double end = System.currentTimeMillis();
		double time = end-start;
		time = time/1000;
		System.out.println("total time in exectuion :"+time);
		System.out.println("total no of zehri numbers between "+n1+" and "+n2+" : "+(count) );
		
}

	void swap(int x,int y)
	{
	char temp;
	temp=str[x];
	str[x]=str[y];
	str[y]=temp;
	}

	void run(int i)
	{
		
		if(i==len)
		{
			String w = String.valueOf(str);
			long number = Long.parseLong(w);
			if(number>e) 
			{
				long p = number ;
				long q = 2*p ;
				long x[] = new long[10];
				long y[] = new long[10];
				while(p>0)
				{
					long m = p%10;
					int n = (int)m;
					p = p/10;
					x[n] = x[n]+1;
				}

				while(q>0)
				{
					long m = q%10;
					int n =(int)m;
					q = q/10;
					y[n] = y[n]+1;
				}
				
				int n=0;
				for(int p1 =0;p1<10;p1++)
				{
					if(x[p1]!=y[p1]) break;
					else n++;				
				}
				
				if(n==10)
				{
					System.out.println(e);count++;
				}
				e = number;
			}
			//System.out.println(str);
		}	
			
		for(int j=i;j<len;j++)
		{		
			
			swap(i,j);
			run(i+1);
			swap(i,j);
		}
	}
	
	ZehriUpdated(char A[],int l)
	{
		str=A;
		len=l;
	}

	
}
