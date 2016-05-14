//This program dispays all the digit of number line wise

import java.util.*;

class Assignment_loop5
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
System.out.println(rem);
n=n-rem;
n=n/10;
}

}
}
