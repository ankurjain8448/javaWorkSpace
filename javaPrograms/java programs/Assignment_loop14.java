//		BINARY NUMBER
import java.util.*;

class Binary
{
void calculate()
{
System.out.println("Enter any number");
Scanner abc = new Scanner(System.in);
int n = abc.nextInt();
int p[] = new int[n];
int q,i,j;
i=0;
if(n==0)
System.out.println("0");
else
{
while(n>0)
{
p[i]=n%2;
q=n/2;
n=q;
i++;	
}
for(j=i;j>=0;j--)
{System.out.print(p[j]);
}

}
}
}


class Assignment_loop14
{
public static void main(String args[])
{
Binary obj = new Binary();
obj.calculate();

}
}
