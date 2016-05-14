//custom Exception

class AgeException extends ArithmeticException
{

AgeException(String str)
{
}

}


class Five2
{
public static void main(String args[])
{

int age=Integer.parseInt(args[0]);


try
{

if(age<18)
{
throw new AgeException("Invalid Age");
}

}
catch(AgeException e)
{
System.out.println(e);
}


System.out.println("Main as usual");


}

}
