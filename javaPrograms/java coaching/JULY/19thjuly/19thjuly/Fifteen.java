class A
{
void display()
{
System.out.println("display in A");
}

}
class B extends A
{
void display()
{
System.out.println("display in B");
}


}

class Fifteen
{
public static void main(String args[])
{
A obj=new B();
obj.display();
}
}


