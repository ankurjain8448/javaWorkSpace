

class A
{

void one(int k)
{
System.out.println("Single "+k);
}


void one(int... k)
{
System.out.println("Several "+k[0]);
}

}

class Va6
{
public static void main(String args[])
{
A obj=new A();
obj.one(786);

obj.one(7,8,6);
}

}
