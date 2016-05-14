import java.io.*;

class Twelve
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter(args[0],true);
PrintWriter pw=new PrintWriter(fw);
pw.println("Pizza");
pw.println("Kulfi");
pw.println("Coke");

fw.close();
}

}
