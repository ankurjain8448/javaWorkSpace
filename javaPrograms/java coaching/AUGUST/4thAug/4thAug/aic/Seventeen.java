class A
{
void one()
{
System.out.println("Ballabhgarh");
}

}

class Seventeen
{
public static void main(String args[])
{

new A()
{
void one()
{
System.out.println("Haryana");
}

A two()
{
System.out.println("Gurgaon");
return this;
}

}.two().one();

}
}
