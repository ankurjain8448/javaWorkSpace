class A
{
}
class B  extends A
{
}

class C
{
}


class Ten
{
public static void main(String args[])
{
A a1=new A();
B b1=new B();

System.out.println(b1 instanceof B);
System.out.println(b1 instanceof A);
System.out.println(a1 instanceof B);

//System.out.println(a1 instanceof C);
System.out.println(b1 instanceof C);

}

}


