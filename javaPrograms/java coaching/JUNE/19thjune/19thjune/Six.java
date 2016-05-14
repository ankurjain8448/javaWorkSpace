class A
{
int n;

void one(int n)
{

n=n;
}

void two()
{
System.out.println(n);
}


}

class Six
{
public static void main(String args[])
{
A obj1=new A();
obj1.one(8);
obj1.two();
}
}
