class A
{

void one() 
{
int n[]={4};
System.out.println("Hello "+n[5]);
}

void two()  
{
one();
}


void three() 
{
two();
}

}

class PST2
{
public static void main(String args[]) 
{
A obj=new A();
try
{
obj.three();
}

catch(Exception e)
{
System.out.println(e);
}

System.out.println("Nothing");

}

}
