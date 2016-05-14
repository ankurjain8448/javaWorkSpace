import java.util.*;
import java.io.*;

class Sixteen
{
public static void main(String args[])  throws IOException
{
FileInputStream fis=new FileInputStream(args[0]);
Scanner abc=new Scanner(fis);

while(abc.hasNextLine())
{
System.out.println(abc.nextLine());
}

}

}
