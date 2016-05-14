class A
{
int n=25;
}
class B extends A
{
int n=10;

void display()
{
System.out.println(n);
System.out.println(this.n);
}
}


class Seven
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}

}
