class A
{
int n=25;
}
class B extends A
{
int n=10;

void display()
{
int n=30;
System.out.println(n);
System.out.println(this.n);
System.out.println(super.n);
}
}


class Three
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}

}
