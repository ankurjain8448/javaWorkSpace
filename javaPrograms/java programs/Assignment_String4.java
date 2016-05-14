//Accept a sentence & display the biggest & smallest word.
import java.util.*;
class Assignment_String4
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter any string ");
String s=in.nextLine();
int temp=0,i=0,k=0;
int j=s.length();
System.out.println(j);
int a[] = new int[j];
for(i=0;i<j;i++)
a[i]=(int)(s.charAt(i));


for(i=0;i<j;i++)
{for(k=i+1;k<j;k++)
{
if(a[i]>a[k])
{temp=a[i];
a[i]=a[k];
a[k]=temp;
}
}
}

//for(i=0;i<j;i++)
System.out.println("greatest word = "+(char)a[j-1]);
System.out.println("Smallest word = "+(char)a[0]);
}
}

