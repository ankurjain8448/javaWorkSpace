class A
{

void one() 
{
}

void two()
{
try
{
one();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Jai Krishna");
}

void three() 
{
two();
System.out.println("Jai Maaa");
}

}


class THRWS3
{
public static void main(String args[]) throws InterruptedException
{

System.out.println("Vishnu Vishnu"); 
System.out.println("Narayan Narayan"); 

A obj=new A();
obj.three();

}

}
