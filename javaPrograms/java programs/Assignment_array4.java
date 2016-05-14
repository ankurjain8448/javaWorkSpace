// Accept seven elements into double array and accept a number and search it in the //array and display its location if it      is present using binary search .

import java.util.*;

class Assignment_array4
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int j=0,i=0;
System.out.println("Enter the number of elements in an array");
int p=in.nextInt();
int a[]= new int[p];
System.out.println("Enter "+p+" elements in array");
{
for(i=0;i<p;i++)
a[i]=in.nextInt();
}


int temp=0;

System.out.println("Enter the number to be searched in an array");
int n=in.nextInt();


for(i=0;i<p;i++)
{
for(j=i+1;j<p;j++)
{
if(a[i]>a[j])
{temp=a[i];
a[i]=a[j];
a[j]=temp;}
}
}


int UB=a[0],LB=a[p-1];
int mid=a[(p-1)/2];


for(j=0;j<=(p-1)/2;j++)
{
if(n>mid)
{UB=mid;}
else if(n<mid)
{LB=mid;}
else if(n==mid)
{System.out.println("number is searched");
break;}
else
System.out.println("number is not present");
}

}
}