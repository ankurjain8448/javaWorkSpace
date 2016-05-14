class A
{

static void display()
{
System.out.println("display in A");
}

}
class B extends A
{

static void display()
{
System.out.println("display in B");
}

}


class Five
{
public static void main(String args[])
{

A  obj=new B();
obj.display();


/*
B.display();
A a1=new A();
a1.display();
*/


}

}
