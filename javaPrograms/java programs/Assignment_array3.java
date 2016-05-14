// Accept seven elements into double array and accept a number and search it in the array and display its location if it      is present using linear search .


import java.util.*;


class Assignment_array3
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.println("Enter the number of rows and columns in an array");
int p=in.nextInt();
int q=in.nextInt();
int a[][]= new int[p][q];

int i=0,temp=0,j=0;
System.out.println("Enter "+p*q+" elements in array");
{for(i=0;i<p;i++)
{for(j=0;j<q;j++)
a[i][j]=in.nextInt();}
}



System.out.println("Enter the number to be searched in an array");
int n=in.nextInt();
{
for(i=0;i<p;i++)
{
	for(j=0;j<q;j++)
	{
	if(n==a[i][j])
	{
	System.out.println("number "+n+" is present in array");
	System.out.println("location of "+n+" is present in array is");
	System.out.println("row = "+(i+1)+ "\ncolumn = "+(j+1));
	}						
	}
}	

}
}
}

