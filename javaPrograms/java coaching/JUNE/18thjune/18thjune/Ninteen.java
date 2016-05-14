class A
{ 
int n;

void println()
{
System.out.println("n is now "+ ++n);
}

}

class Ninteen
{
public static void main(String args[])
{
A obj=new A();

obj.println();
obj.println();
obj.println();

}



}
