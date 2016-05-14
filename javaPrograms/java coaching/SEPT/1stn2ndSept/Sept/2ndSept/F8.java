class A
{

int one()
{

try
{
return 50;
}
finally
{
System.out.println("This is finally");
}

}

}


class F8
{
public static void main(String args[]) 
{

System.out.println("Vishnu"); 

A obj=new A();
System.out.println(obj.one()); 

}

}
