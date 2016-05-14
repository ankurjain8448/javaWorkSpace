class A
{ 
int n;

void println()
{
System.out.println("n is now "+ ++n);
}

}

class Eighteen
{
public static void main(String args[])
{
A obj=new A();

new A();//anonymous object

new A().println();
new A().println();
new A().println();

}



}
