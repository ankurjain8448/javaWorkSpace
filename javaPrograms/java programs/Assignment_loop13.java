//This program accept a number and display next prime number bigger than the number

import java.util.*;
class Assignment_loop13
{
public static void main(String args[])
{
System.out.println("For prime number\nEnter any numbers");
Scanner obj=new Scanner(System.in);
double n=obj.nextDouble();
while(true)
{double i=1.0;
n++;
{
while(i<n)
{ i++;
if(n%i==0)
{break;}
}
if(i==n)
{int p=(int)n;
System.out.println(p+" is a prime number\n");
break;}}
}
}
}