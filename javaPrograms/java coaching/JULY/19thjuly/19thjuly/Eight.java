class A
{
}
class B extends A
{
}


class Eight
{
public static void main(String args[])
{
A a1=new A();
B b1=new B();

System.out.println(b1 instanceof B);
System.out.println(b1 instanceof A);


}

}


