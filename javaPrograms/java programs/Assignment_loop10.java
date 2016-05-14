//This program accept number of term and display fibonacci series

import java.util.*;



class Assignment_loop10
{
public static void main(String args[])
{
Scanner abc= new Scanner(System.in);

System.out.println("Enter any number");

int n= abc.nextInt();

long a[] = new long[n];
a[0]=0;
a[1]=1;
System.out.print("0 1");
for(int p=2;p<n;p++)
{a[p]=a[p-1] + a[p-2];
System.out.print(" "+a[p]);
}


}
}
