class A
{
void display()
{
System.out.println("New Delhi");
}

}

class Five
{
public static void main(String args[])
{

A obj=new A()
{
void display()
{
System.out.println("New York");
}
};

obj.display();


}

}


