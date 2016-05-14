class A
{
//super class

void display()
{
System.out.println("Hello ");
}

}

class B extends A
{
//sub class
}

class I3
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}

}


