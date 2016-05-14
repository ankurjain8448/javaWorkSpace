class A
{
void display()
{
System.out.println("New Delhi");
}

}


class B
{

A obj=new A()
{
void display()
{
System.out.println("New Arizona");
}
};

obj.display();

}


class Six
{
public static void main(String args[])
{


B temp=new B();


}

}


