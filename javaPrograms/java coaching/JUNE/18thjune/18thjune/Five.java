class A
{

void display()
{
System.out.println("New Delhi");
}

}

class Four
{
public static void main(String args[])
{

A obj=new A();
obj.display();
System.out.println(obj);
System.out.println(obj.toString());
System.out.println(obj.hashCode());


}
}
