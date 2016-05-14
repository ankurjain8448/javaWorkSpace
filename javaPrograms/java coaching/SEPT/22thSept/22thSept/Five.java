import java.io.*;

class Five
{
public static void main(String args[]) throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter the name plz");
String name=dis.readLine();
System.out.println(name + "Could u plz enter the roll number");
int roll=Integer.parseInt(dis.readLine());

System.out.println(name +"\n ur roll number is "+roll);
}

}
