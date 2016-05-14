import java.io.*;

class Six
{
public static void main(String args[]) throws IOException
{
DataInputStream dis=new DataInputStream(System.in);

String name=dis.readLine();
int roll=Integer.parseInt(dis.readLine());

System.out.println(name +"\n ur roll number is "+roll);
}

}
