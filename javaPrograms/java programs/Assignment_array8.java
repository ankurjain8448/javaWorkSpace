/*8.Accept elements in [4X4] int array and
(1.)Display the sum of each row
(2.)Display the elements in matrix format
(3.)Display the transpose of a matrix
(4.)Display the elements of first diagonal
(5.)Display the elements of lower triangle
(6.)Display the elements of upper triangle
*/

import java.util.*;

class Assignment_array8
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int a[][] = new int[4][4];
char ch;
int i=0,j=0;
System.out.println("Enter 16 elements in the matrix in row major");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
a[i][j]=in.nextInt();
}


do{
System.out.println("(1.)Display the sum of each row");
System.out.println("(2.)Display the elements in matrix format");
System.out.println("(3.)Display the transpose of a matrix");
System.out.println("(4.)Display the elements of first diagonal");
System.out.println("(5.)Display the elements of lower triangle");
System.out.println("(6.)Display the elements of upper triangle");

System.out.println("In whic case u want to enter");
int c=in.nextInt();
switch(c)
{
case 1 :
		System.out.println("Sum of each row is");
	for(i=0;i<4;i++)
	{
	int sum=0;
	for(j=0;j<4;j++)
	sum= sum + a[i][j];
	System.out.println("Sum of row "+(i+1)+" is "+sum);
	}
		break;

case 2:
		{for(i=0;i<4;i++)
		{for(j=0;j<4;j++)
		System.out.print(a[i][j]+"\t");
		System.out.println("\n ");}
		}
		
		break;

case 3:
		
		int r[][]=new int[4][4];
		for(i=0;i<4;i++)
		{for(j=0;j<4;j++)
		if(i==j)
		r[i][j]=a[i][j];
		else
		r[i][j]=a[j][i];
		}
				
		{for(i=0;i<4;i++)
		{for(j=0;j<4;j++)
		System.out.print(r[i][j]+"\t");
		System.out.println("\n ");}
		}
		
		
		break;
		
case 4:
			for(i=0;i<4;i++)
			{for(j=0;j<4;j++)
				if(i==j)
				System.out.println( a[i][j] );
				}
			
		break;
		
case 5:
		for(i=0;i<4;i++)
			{for(j=0;j<=i;j++)
			System.out.println( a[i][j] );
			
			}
		break;
		
case 6:
		for(i=0;i<4;i++)
			{for(j=i;j<4;j++)
			System.out.println( a[i][j] );
			
			}
		
		break;
	
}
		System.out.println("Do u want to continue???");
 ch=in.next().charAt(0);
}while(ch=='y'||ch=='Y');


}
}