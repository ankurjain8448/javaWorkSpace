import java.io.*;

class THRWS2
{
public static void main(String args[]) throws IOException
{

FileOutputStream fos=new FileOutputStream(args[0]);

try
{
Thread.sleep(4000);
System.out.println("Simple");
}
catch(Exception e)
{
System.out.println(e);
}

}

}
