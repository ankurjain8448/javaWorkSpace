//custom Exception

class AgeException extends ArithmeticException
{

public String toString()
{
return "Age is UnAcceptable!";
}

}


class Six
{
public static void main(String args[])
{

int age=Integer.parseInt(args[0]);


try
{

if(age<18)
{
throw new AgeException();
}

}
catch(AgeException e)
{
System.out.println(e);
}


System.out.println("Main as usual");


}

}
