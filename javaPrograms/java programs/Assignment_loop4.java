//		This program dispays all the factors of accepted number

import java.util.*;

class Assignment_loop4
{
public static void main(String args[])
{
Scanner abc= new Scanner(System.in);
System.out.println("Enter any number");
int n= abc.nextInt();
int k=n;
int i=0,count =0;
int p[] = new int[n];

while(n!=1)
{
for(i=2;i<=n;i++)
    {
       if(n%i==0)
	{
	    {
		n=n/i;		
		p[count]=i;
		count++ ;	
		}
	break;
		}
}
	}
System.out.println("The Factorn of " +k + " are...");
System.out.println("1");
for(i=0;i<count;i++)
System.out.println(p[i]);

}
}
