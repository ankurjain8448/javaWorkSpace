//			even or odd
import java.util.*;

class Q
{
public static void main(String args[])
{
double start =System.currentTimeMillis();
//double s = System.nanoTime();
Scanner abc= new Scanner(System.in);
System.out.println("Enter any number");
//int n= abc.nextInt();
int n = 3456;
if(n%2==0)
System.out.println("number is even");
else
System.out.println("Number is odd");
//double e = System.nanoTime();
double end = System.currentTimeMillis();

double time = end - start;
//double t = e-s;
time = time/1000;
System.out.println(time+" s");
//System.out.println(t+" s");
}
}
