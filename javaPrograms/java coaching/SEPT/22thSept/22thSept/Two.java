import java.io.*;

class Two
{
public static void main(String args[]) throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter a line Plz...");
String abc=dis.readLine();
System.out.println("u just said "+abc);
}

}
