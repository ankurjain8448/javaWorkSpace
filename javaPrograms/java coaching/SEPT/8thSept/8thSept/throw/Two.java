class Two
{
public static void main(String args[])
{


int age=Integer.parseInt(args[0]);

if(age<18)
{
ArithmeticException e=new ArithmeticException();
throw e; 
}

System.out.println("Main as usual");


}

}
