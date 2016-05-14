interface I
{
void display();
}

class A implements I
{
public void display()
{
System.out.println("This is display in A");
}

}

class Eight
{
public static void main(String args[])
{
A obj=new A();
obj.display();

}

}

