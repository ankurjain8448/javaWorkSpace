class A
{

private void display()
{
System.out.println("Hi This is display in A");
}

}
class B extends A
{

int display()
{
System.out.println("Hi this is display in B");
return 5;
}

}


class Thirteen
{
public static void main(String args[])
{

B obj=new B();
obj.display();
int k=obj.display();
System.out.println(k);

}

}
