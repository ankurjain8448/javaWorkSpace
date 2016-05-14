//	Pattern 
import java.util.*;

class pattern
{

void setPattern()
{
Scanner abc = new Scanner(System.in); 
System.out.println("Enter any number");
int n = abc.nextInt();
for(int i=n;i>0;i--)
{
for(int j=i;j>0;j--)
{
System.out.print(j + " ");
}
System.out.println(" ");
}
}

}


class Assignment_loop15
{
public static void main(String args[])
{
pattern obj = new pattern();
obj.setPattern();
}
}

