class A
{

int one()
{

return 80;

try
{
System.out.println("This is try");
}
finally
{
System.out.println("This is finally");
return 50;
}
}

}


class F11
{
public static void main(String args[]) 
{

System.out.println("Vishnu"); 

A obj=new A();
System.out.println(obj.one()); 

}

}
