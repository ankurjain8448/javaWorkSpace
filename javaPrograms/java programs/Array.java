import java.util.*;

class Array
{
public static void main(String args[])
{
Scanner abc= new Scanner(System.in);
System.out.println("Enter the no elements in an array\n");
int n=abc.nextInt();


int a[]=new int[n];		//create array
System.out.println("Enter any number\n");
for(int i=0;i<n;i++)		//enter elements in array
a[i]=abc.nextInt();

	//Finding sum of all the elements of array
int sum=0;
for(int i=0;i<n;i++)
sum=sum+a[i];
System.out.println("\nSum of all the elements of the array are"+sum);

	//reverse traversing

System.out.println("\nreverse traversing of array\n");
for(int i=n-1;i>=0;i--)
System.out.println(a[i]);

}
}