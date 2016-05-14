class A
{

void display()
{
System.out.println("Hi This is display in A");
}

}
class B extends A
{

void display(int n)
{
System.out.println("Hi this is display in B \n n is"+n );
}

}


class Twelve
{
public static void main(String args[])
{

B obj=new B();
obj.display();
obj.display(5);

}

}
