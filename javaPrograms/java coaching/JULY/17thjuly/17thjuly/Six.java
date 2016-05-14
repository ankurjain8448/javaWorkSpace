class A
{

{
System.out.println("I");
}

static
{
System.out.println("SI");
}

A()
{
System.out.println("C");
}

void display()
{
System.out.println("D");
}

}


class Six
{
public static void main(String args[])
{
new A().display();
}
}
