class A
{

static
{
System.out.println("Class has just been loaded");
}

void display()
{
System.out.println("Radhey Krishna");
}


}


class Four
{
public static void main(String args[])
{
new A();new A();new A();
//obj.display();

}
}
