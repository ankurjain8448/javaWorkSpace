import java.util.*;
class Prime_no
{
public static void main(String args[])
{
System.out.println("For prime number\nEnter any no\n");
Scanner obj=new Scanner(System.in);
double n=obj.nextDouble();
double i;
i=2.0;
while(i<n)
{ 
	if(n%i==0)
{System.out.println("no is not prime");
break;}
i++;
	}

if(i==n)
System.out.println(" prime number\n");
}
}
