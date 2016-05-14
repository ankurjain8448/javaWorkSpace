class A
{

A()
{System.out.println("hello");}

A(int k)
{this();
System.out.println("The value of k : "+k);
}

A(int k,int m)
{
this(k+m);
System.out.println("here two variables : "+k+","+m);
}

}



class Constructor_Chaining
{
public static void main(String args[])
{
A obj = new A(5,15);
}
}