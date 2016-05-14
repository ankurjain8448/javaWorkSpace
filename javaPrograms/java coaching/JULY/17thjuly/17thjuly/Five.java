class A
{

static
{
System.out.println("static init 1");
}

static
{
System.out.println("static init 2");
}

void display()
{
System.out.println("Krishna Radha");
}

}


class Five
{
public static void main(String args[])
{
new A().display();

}
}
