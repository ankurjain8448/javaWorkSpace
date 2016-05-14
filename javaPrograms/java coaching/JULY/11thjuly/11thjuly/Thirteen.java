class B
{
int n;

void display()
{
System.out.println(n);
}

}

class A
{
B obj;
}

class Thirteen
{
public static void main(String args[])
{
A z=new A();

z.obj.display();
System.out.println(z.obj.n);

}


}