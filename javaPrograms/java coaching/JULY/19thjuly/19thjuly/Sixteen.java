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

class Sixteen
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}
}


