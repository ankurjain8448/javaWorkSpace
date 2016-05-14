//This program accept number and checks for palindrome

import java.util.*;

class Assignment_loop7
{
public static void main(String args[])
{
Scanner abc= new Scanner(System.in);
System.out.println("Enter any number");
int n= abc.nextInt();
int a[] = new int [20];
int i=0,s=0,rem =0;

while(n!=0)
{
rem=n%10;
a[s]=rem;
n=n-rem;
n=n/10;
s++;
}

if((s-1)%2!=0)
System.out.println("number is not palindrome");
else
{
while(i!=((s+1)/2))
{
if(a[i]!=a[s-1-i])
{{ 
System.out.println("number is not palindrome");
break;
}
}
else
{if(i==(s/2))
System.out.println("number is palindrome");}
i++;}

}



}
}
