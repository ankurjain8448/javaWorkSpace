class A
{ 
int z=20; 
}

class Thirteen
{
public static void main(String args[])
{
A obj1=new A();
obj1.z=40;

A obj2=new A();
obj2.z=80;

obj2=obj1;

obj1.z=70;
obj2.z=150;

System.out.println(obj1.z);
System.out.println(obj2.z);

}
}
