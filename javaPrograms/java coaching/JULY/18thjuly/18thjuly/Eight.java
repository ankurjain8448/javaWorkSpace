class A
{
private int n=25;
}
class B extends A
{

void display()
{
System.out.println(super.n);
}

}


class Eight
{
public static void main(String args[])
{

B obj=new B();
obj.display();
}

}
