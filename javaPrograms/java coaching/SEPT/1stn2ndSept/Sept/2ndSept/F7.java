class A
{

int one()
{

try
{
System.out.println("This is Try");
return 15;
}
finally
{
return 50;
}

}

}


class F7
{
public static void main(String args[]) 
{

System.out.println("Vishnu"); 

A obj=new A();
System.out.println(obj.one()); 

}

}
