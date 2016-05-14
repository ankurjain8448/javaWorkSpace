//This program accept two numbers and display all the prime numbers between them

import java.util.*;
class Assignment_loop12
{
public static void main(String args[])
{
System.out.println("For prime number\nEnter any no two numbers");
Scanner obj=new Scanner(System.in);
double n=obj.nextDouble();
double n1=obj.nextDouble();
//double j;
for(n=n;n<=n1;n++)
{double i=1.0;
{
while(i<n)
{ i++;
if(n%i==0)
{break;}
}
if(i==n)
{int p=(int)n;
System.out.println(p+" is a prime number\n");}}
}
}
}