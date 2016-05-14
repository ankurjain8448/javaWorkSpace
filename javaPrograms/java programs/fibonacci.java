import java.util.Scanner;
class Fib
{
public static void main(String args[])
{

System.out.println("enter n");
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int i=1,j=0;
for(int k=1;k<=n;k++)
{
System.out.print(j + " ");

j=i+j;

i= j-i;
}
}
}

