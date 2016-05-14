class Three
{
public static void main(String args[])
{


int age=Integer.parseInt(args[0]);


try
{
if(age<18)
{
ArithmeticException e=new ArithmeticException();
throw e; 
}
}
catch(Exception e)
{
System.out.println(e);
}


System.out.println("Main as usual");


}

}
