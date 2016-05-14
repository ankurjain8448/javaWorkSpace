import java.io.*;

class Three
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("You want to say......");
String line=br.readLine();
System.out.println("u just said "+line);
}

}
