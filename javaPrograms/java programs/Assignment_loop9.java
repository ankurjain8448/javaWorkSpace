//This program accept number and check it is armstrong number or not

import java.util.*;

class Assignment_loop9
{
public static void main(String args[])
{
Scanner abc= new Scanner(System.in);
System.out.println("Enter any number");
int n= abc.nextInt();
int k=n;
int s=0,rem =0;

while(n!=0)
{
rem=n%10;
s=s+rem*rem*rem;
n=n-rem;
n=n/10;
}
if(k==s)
System.out.println("The number " +k+ " is armstrong");
else
System.out.println("The number " +k+ " is not armstrong");


}
}
