class A
{
int n;

static A obj1=new A();

void one()
{
System.out.println("Hello");
}

}

class Five
{
public static void main(String args[])
{
A obj=new A();
obj.one();

}

}
