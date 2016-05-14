import java.util.*;
import java.io.*;

class Four
{
public static void main(String args[]) throws IOException
{

FileInputStream fis=new FileInputStream(args[0]);

System.setIn(fis);

Scanner abc=new Scanner(System.in);

String str=abc.next();

System.out.println("Hello "+str);

}

}
