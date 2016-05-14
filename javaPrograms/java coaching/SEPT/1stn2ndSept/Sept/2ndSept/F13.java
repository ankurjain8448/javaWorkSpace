class A
{

int one()
{
try
{
System.out.println("try 1");
int n[]={5};
n[7]=89;
System.out.println("try 2");
}
finally
{
System.out.println("This is finally");
}

return 12;

}

}


class F13
{
public static void main(String args[]) 
{

System.out.println("Vishnu"); 

A obj=new A();
System.out.println(obj.one()); 
System.out.println("Narayan"); 

}

}
