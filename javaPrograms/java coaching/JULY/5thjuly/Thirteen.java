class A
{

int fact(int n)
{
if(n==0)
return 1;
else
return n*fact(n-1);
}


}

class Thirteen
{
public static void main(String args[])
{
A obj=new A();

System.out.println(obj.fact(5));

}

}
