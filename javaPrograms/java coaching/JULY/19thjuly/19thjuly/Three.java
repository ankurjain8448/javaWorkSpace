/*
private 
default
protected
public
*/





class A
{
//overridden
public void display()
{
System.out.println("Hi This is display in A");
}

}
class B extends A
{
//overriding

void display()
{
System.out.println("Hi this is display in B");
}

}


class Two
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}

}
