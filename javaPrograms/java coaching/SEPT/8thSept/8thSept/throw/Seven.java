import java.io.*;

//custom Exception

class AgeException extends IOException
{

public String toString()
{
return "Age is UnAcceptable!";
}

}


class Seven
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
