class A
{

void one()
{
two();
int n,m;
System.out.println("Hello This is One");
}

void two()
{
three();
double d;
System.out.println("Hello This is Two");

}

void three()
{
boolean b;
System.out.println("Hello This is Three");
}


}

class Twelve
{
public static void main(String args[])
{
A obj=new A();
obj.one();

System.out.println("Hiiii everyOne! This is main...");
}

}
