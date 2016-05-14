class A
{
void display()
{
System.out.println("display in A");
}

}
class B extends A
{


}

class Ninteen
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}
}


