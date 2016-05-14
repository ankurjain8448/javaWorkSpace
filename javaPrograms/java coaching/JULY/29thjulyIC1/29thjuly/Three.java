interface A
{
void display();
}

abstract class B implements A
{

void one()
{
System.out.println("Hello This is One");
}

}

class C extends B
{
public void display()
{
System.out.println("Shree Ram");
}
}


class Three
{
public static void main(String args[])
{
C obj=new C();
obj.one();
obj.display();
}

}
