interface I
{
}

class A implements I
{
}

class Twelve
{
public static void main(String args[])
{
/*
A obj=new A();
System.out.println(obj instanceof A);
*/

I temp=new A();
System.out.println(temp instanceof A);

}

}

