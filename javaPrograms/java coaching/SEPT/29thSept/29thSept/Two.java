import java.io.*;

class Two
{
public static void main(String args[]) throws IOException
{
FileWriter fw=new FileWriter(args[0]);
PrintWriter pw=new PrintWriter(fw);

String str="";

for(int k=1;k<=8191;k++)
str=str+"k";

pw.println(str);
}

}
