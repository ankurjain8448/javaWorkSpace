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

class PST3
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
e.printStackTrace();
}

System.out.println("No One");

}

}
