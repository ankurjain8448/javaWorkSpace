import java.io.*;

class Four
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter(args[0]);
PrintWriter pw=new PrintWriter(fw);

pw.println("Sachin Tendulkar");
pw.println(1);
pw.println(true);
pw.println(5487.32);
pw.println('J');

pw.close();
fw.close();


}

}
