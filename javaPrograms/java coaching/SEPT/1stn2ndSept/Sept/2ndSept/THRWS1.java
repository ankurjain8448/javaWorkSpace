class A
{

void one() throws InterruptedException
{
Thread.sleep(3000);
System.out.println("Jai Ram");
}

void two() throws InterruptedException
{
one();
System.out.println("Jai Krishna");
}

void three() throws InterruptedException
{
two();
System.out.println("Jai Maaa");
}




}


class THRWS1
{
public static void main(String args[]) throws InterruptedException
{

System.out.println("Vishnu"); 
System.out.println("Narayan"); 

A obj=new A();
obj.three();

}

}
