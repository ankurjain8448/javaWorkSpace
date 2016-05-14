class A
{


static class B
{

static void one()
{
System.out.println("This is one in B");
}

}


void two()
{
B.one();
}

}


class Five
{
public static void main(String args[])
{
A obj=new A();
obj.two();
}

}



