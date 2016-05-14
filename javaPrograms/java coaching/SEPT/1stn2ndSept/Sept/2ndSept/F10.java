class A
{

int one()
{

try
{
System.out.println("This is try");
return 10;
}
finally
{
System.out.println("This is finally");
return 50;
}

System.out.println("Simple");
return 100;

}

}


class F10
{
public static void main(String args[]) 
{

System.out.println("Vishnu"); 

A obj=new A();
System.out.println(obj.one()); 

}

}
