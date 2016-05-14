class A
{
void display()
{
System.out.println("New Delhi");
}

}

class Three
{
public static void main(String args[])
{

new A(){}.display();
new A().display();

}

}


