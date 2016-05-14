class A
{
void display()
{
System.out.println("India");
}

}

class One
{
public static void main(String args[])
{

new A()
{

void one()
{
display();
}

}.one();


}

}


