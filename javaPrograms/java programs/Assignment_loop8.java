//This program accept number and display its reverse

import java.util.*;

class Assignment_loop8
{
public static void main(String args[])
{
Scanner abc= new Scanner(System.in);
System.out.println("Enter any number");
int n= abc.nextInt();
int rem =0;
System.out.println("In reverse order ");
while(n!=0)
{
rem=n%10;
System.out.print(rem);
n=n-rem;
n=n/10;
}



}
}
