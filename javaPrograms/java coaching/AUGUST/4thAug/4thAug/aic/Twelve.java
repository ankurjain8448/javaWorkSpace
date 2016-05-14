interface A
{
void one();
void two();
}



class Twelve
{
public static void main(String args[])
{

new A()
{
public void one()
{
System.out.println("Haryana");
}

}.one();

}
}
