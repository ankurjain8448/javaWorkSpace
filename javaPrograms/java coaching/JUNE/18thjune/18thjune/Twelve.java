class A
{ 
int z=20; 
}

class Twelve
{
public static void main(String args[])
{
A obj1=new A();
obj1.z=40;

A obj2=new A();
obj2.z=80;

System.out.println(obj1.z);
System.out.println(obj2.z);

}
}
