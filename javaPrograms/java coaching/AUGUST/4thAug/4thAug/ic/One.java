class One
{
public static void main(String args[])
{
class A
{
void one()
{
System.out.println("J2SE");
}

}

class B extends A
{
void two()
{
one();
}

}

B obj=new B();
obj.two();





}

}
