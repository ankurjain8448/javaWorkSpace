abstract class A
{
abstract void display();
}

class B extends A
{
//display has been overridden in B
void display()
{
System.out.println("Hello this is display");
}

}


class Seven
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}

}



