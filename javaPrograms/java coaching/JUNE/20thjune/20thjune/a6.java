import java.util.*;

class A6
{


public static void main(String args[])
{
Scanner abc=new Scanner(System.in);
System.out.println("Enter the size ");
int num=abc.nextInt();

int arr[]=new int[num];

for(int k=0;k<arr.length;k++)
{
System.out.println("Enter the number ");
arr[k]=abc.nextInt();
}

for(int k=0;k<arr.length;k++)
{
System.out.println(arr[k]);
}

}

}

