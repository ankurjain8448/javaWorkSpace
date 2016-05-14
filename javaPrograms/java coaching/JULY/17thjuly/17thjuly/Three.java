class A
{

static
{
System.out.println("Class has just been loaded");
}

static void display()
{
System.out.println("Radhey Radhey");
}


}


class Three
{
public static void main(String args[])
{
A.display();
A.display();
}
}
