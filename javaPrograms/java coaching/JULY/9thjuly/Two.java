class A
{

void one()
{
System.out.println("This is one");
one();
}

}


class Two
{
public static void main(String args[])
{
A obj=new A();
obj.one();

}
}
