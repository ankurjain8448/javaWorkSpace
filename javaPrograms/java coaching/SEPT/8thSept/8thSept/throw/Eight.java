import java.io.*;

//custom Exception

class AgeException extends Exception
{

public String toString()
{
return "Age is UnAcceptable!";
}

}


class Eight
{
public static void main(String args[])
{

int age=Integer.parseInt(args[0]);


if(age<18)
{
throw new AgeException();
}


System.out.println("Main as usual");

}

}
