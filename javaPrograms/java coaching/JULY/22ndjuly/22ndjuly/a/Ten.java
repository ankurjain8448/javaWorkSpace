abstract class A
{

void one()
{
System.out.println("This is one");
}

}

class B extends A
{
void two()
{
System.out.println("This is two");
}

}




class Ten
{
public static void main(String args[])
{
B obj=new B();
obj.one();
obj.two();
}

}



