class A
{

void one()
{
System.out.println("This is one");
two();
}
void two()
{
System.out.println("This is too");
}


}


class One
{
public static void main(String args[])
{
A obj=new A();
obj.one();

}
}
