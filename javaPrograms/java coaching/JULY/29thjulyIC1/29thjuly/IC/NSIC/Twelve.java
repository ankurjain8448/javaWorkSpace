class A
{

int n=10;

class B
{
int n=20;

void display()
{
int n=30;
System.out.println("n is "+n);
System.out.println("this.n is "+this.n);
//System.out.println("A.n is "+A.n);
System.out.println("A.this.n is "+A.this.n);
}

}

}

class Twelve
{
public static void main(String args[])
{

A.B temp=new A().new B();
temp.display();
}

}
