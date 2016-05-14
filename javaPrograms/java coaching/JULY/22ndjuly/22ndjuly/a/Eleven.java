abstract class A
{

A()
{
System.out.println("A");
}

}

class B extends A
{

B()
{
System.out.println("This is B");
}

}




class Eleven
{
public static void main(String args[])
{
new B();

}
}



