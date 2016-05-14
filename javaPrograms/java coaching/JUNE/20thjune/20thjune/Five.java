class A
{
int n=100;

static void display()
{
System.out.println(n);
System.out.println(getN());
System.out.println(this);
}

int getN()
{
return n;
}


}

class Five
{
public static void main(String args[])
{
A obj=new A();
obj.display();
}

}








