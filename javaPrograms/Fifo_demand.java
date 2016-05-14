import java.util.Scanner;
class Fifo_demand
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the demand size : ");
int j =in.nextInt();
int counter = 0;
int demand[]= new int[j];
for(int m = 0;m<j;m++)
{System.out.print("Enter demand : "); demand[m] = in.nextInt(); }
System.out.println("Enter the Size of catch");
int i= in.nextInt();
int cAtch[] = new int[i] ;
for(int n =0;n<j;n++)
{
int q=0,flag=0;
int p = demand[n];
while(cAtch[q]!=0)
{
if(demand[n]==cAtch[q]) {flag =1; break;}
else if((q==(i-1))&&(demand[n]!=cAtch[q])) // FIFO tech..
{
cAtch[counter] = p;
counter++;
break ;
}
q++;
}
if(flag ==0) {System.out.println("This is a miss");cAtch[q] = demand[n];}
else System.out.println("This is a hit");
}



}
}