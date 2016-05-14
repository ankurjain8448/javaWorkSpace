class A
{
int n=10;

void one()
{
int n=20;
System.out.println(n);
}

}

class Five
{
public static void main(String args[])
{
A obj1=new A();
obj1.one();
System.out.println(obj1.n);


}
}
