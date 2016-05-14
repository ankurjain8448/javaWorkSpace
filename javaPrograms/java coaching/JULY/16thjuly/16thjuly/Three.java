class A
{
int n;

void one()
{
A obj1=new A();
obj1.n=58;
System.out.println(obj1.n);
}


}

class Three
{
public static void main(String args[])
{
A obj=new A();
obj.one();

}

}
