class A
{
void display()
{
System.out.println("New Delhi");
}

}

class Four
{
public static void main(String args[])
{

new A()
{
void one()
{
System.out.println("Java in One");
}
}.one();


new A()
{
void one()
{
System.out.println("Java in One");
}
}.display();

}

}


