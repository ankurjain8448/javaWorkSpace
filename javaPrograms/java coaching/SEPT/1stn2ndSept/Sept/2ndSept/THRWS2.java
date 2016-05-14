class A
{

void one() throws InterruptedException
{
Thread.sleep(3000);
System.out.println("Jai Ram");
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


class THRWS2
{
public static void main(String args[]) 
{

System.out.println("Vishnu Vishnu"); 
System.out.println("Narayan Narayan"); 

A obj=new A();
obj.three();

}

}
