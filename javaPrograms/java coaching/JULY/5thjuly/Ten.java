class A
{

void one()
{
System.out.println("Hello This is One");
one();
}

}

class Ten
{
public static void main(String args[])
{
A obj=new A();
obj.one();
}

}
