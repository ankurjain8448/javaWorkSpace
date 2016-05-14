import java.io.*;


class depu
{
static int count=0;
public static void main(String args[])
{
   java.util.Scanner in = new java.util.Scanner(System.in);
   int n=in.nextInt();
   System.out.println(c(n));
   System.out.println("count= "+count);
}

static int c(int n){
	count++;
    if(n==1) return 1;
	int sum =0;
	for(int i=1;i<n;i++){
	    sum = sum + c(i)*c(n-i);
		}
    return sum+1;
}

}