class V
{
void one()
{
n=50;
}
int n;
}



class A
{

int n=10;

class B
{
void display()
{
System.out.println("n is "+(n+m));
}

}
int m=30;
}

class Six
{
public static void main(String args[])
{
A.B temp=new A().new B();
temp.display();
}

}
