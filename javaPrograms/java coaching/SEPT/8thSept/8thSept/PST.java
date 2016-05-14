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

class PST
{
public static void main(String args[]) 
{
A obj=new A();
obj.three();
System.out.println("anything");

}

}
