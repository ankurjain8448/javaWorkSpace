import java.util.*;

class Ten
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);

System.out.println("Plz enter the size");
int size=in.nextInt();

int num[]=new int[size];

for(int k=0;k<num.length;k++)
{
System.out.println("Plz enter the number "+(k+1));
num[k]=in.nextInt();
}



System.out.println("The entered elements are....");

for(int k=0;k<num.length;k++)
System.out.println(num[k]);





}

}