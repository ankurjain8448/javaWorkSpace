class A
{

}
class B extends A
{
void display()
{
System.out.println("display in A");
}

}

class Twenty
{
public static void main(String args[])
{
A obj=new B();
obj.display();
}
}


