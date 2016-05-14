import java.io.*;

class Four
{
public static void main(String args[]) throws IOException
{


int age=Integer.parseInt(args[0]);

if(age<18)
{
IOException e=new IOException();
throw e; 
}

System.out.println("Main as usual");


}

}
