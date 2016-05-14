import java.io.*;

class One
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter(args[0]);
PrintWriter pw=new PrintWriter(fw);
pw.println("Vishnu");
pw.println("Laxmi");
pw.println("Hanuman");
pw.flush();
}

}
