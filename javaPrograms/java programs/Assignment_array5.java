//Accept n number of elements in a char array and display them in reverse order.

import java.util.*;

class Assignment_array5
{
public static void main(String[] args)
{
int n=0;
System.out.println("Enter no of elements");
Scanner in = new Scanner(System.in);
n=in.nextInt();
char arr[] = new char[n];
System.out.println("Enter "+n+" number of chars");
int i=0;
for(i=0;i<n;i++)
arr[i]=in.next().charAt(0);
System.out.println("In reverse order");
for(i=n-1;i>=0;i--)
System.out.println(arr[i]);
}
}