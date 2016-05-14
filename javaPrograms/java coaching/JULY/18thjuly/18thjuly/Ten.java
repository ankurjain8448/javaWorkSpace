class A
{
//overridden
void display()
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
super.display();
}

}


class Ten
{
public static void main(String args[])
{

B obj=new B();
obj.display();
}

}
