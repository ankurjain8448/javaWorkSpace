class A
{

private int n;
static private int count;

private A(int n)
{
this.n=n;
count++;
}

static A obj;

public static A getA(int n)
{

if(count==0)
obj=new A(n);

return obj;
}


void display()
{
System.out.println(n);
}
}

class FM2
{
public static void main(String args[])
{
A obj1=A.getA(3200);
obj1.display();

 obj1=A.getA(8000);
obj1.display();

 obj1=A.getA(9700);
obj1.display();



}

}
