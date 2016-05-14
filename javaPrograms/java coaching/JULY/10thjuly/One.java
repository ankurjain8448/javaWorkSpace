class A
{
void display()
{
System.out.println("Hello");
}

}

class One
{
public static void main(String args[])
{
A obj=new A();
obj.display();

//System.out.println(obj instanceof A);

System.out.println(obj.getClass());

int num[]=new int[5];
System.out.println(num);
System.out.println(num.getClass());

}

}