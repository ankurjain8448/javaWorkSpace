interface I
{
int a=100;
}

class A 
{

void one()
{
System.out.println("Hello this is one");
}

}

class B extends A implements I
{

void five()
{
one();
System.out.println(a);
}

}


class Twenty1
{
public static void main(String args[])
{
B obj=new B();
obj.five();
}
}
