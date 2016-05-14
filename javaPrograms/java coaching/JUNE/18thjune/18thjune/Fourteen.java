class A
{ 
int z=20; 
}

class B
{
int z=40;
}


class Fourteen
{
public static void main(String args[])
{
A obj1=new A();
obj1.z=400;

B obj2=new B();
obj2.z=800;

obj2=obj1;

obj1.z=700;
obj2.z=1500;

System.out.println(obj1.z);
System.out.println(obj2.z);

}
}
