class A
{

void display()
{
System.out.println("New Delhi");
}

}

class Six
{
public static void main(String args[])
{

A obj=new A();

System.out.println(obj);
System.out.println(obj.toString());
System.out.println(obj.hashCode());

System.out.println(Integer.toHexString(obj.hashCode()));


}
}
