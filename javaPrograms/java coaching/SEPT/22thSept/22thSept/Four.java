import java.io.*;

class Four
{
public static void main(String args[]) 
{

Console c=System.console();


String sentence=c.readLine("Enter something Please.....");
System.out.println("u said "+sentence);


char pswd[]=c.readPassword("Enter the password");
System.out.println("i know ur password \n it is   "+new String(pswd));


}

}
