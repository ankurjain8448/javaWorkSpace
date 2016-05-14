class A
{

void display()
{
System.out.println("Hi This is display in A");
}

}
class B extends A
{

public void display()
{
System.out.println("Hi this is display in B");
}

}


class Four
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}

}
