// Accept five elements into an int array and display them in ascending order.


import java.util.*;

class Assignment_array2fn2
{
void know()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of elements in an array");
int p=in.nextInt();
int a[]= new int[p];
int i=0,temp=0;
//int arrnew[] = new int[p];
int j=0;
System.out.println("Enter "+p+" elements in array");
for(i=0;i<p;i++)
a[i]=in.nextInt();

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


System.out.println("In increasing order");
for(j=0;j<p;j++)
System.out.println(a[j]);

}


}


class Assignment_array2
{
public static void main(String[] args)
{

Assignment_array2fn2 obj =  new Assignment_array2fn2();
obj.know();

}
}

