import java.io.*;

class Five
{
public static void main(String args[]) throws IOException
{
FileReader fr=new FileReader(args[0]);
BufferedReader br=new BufferedReader(fr);

String str;

while((str=br.readLine())!=null)
System.out.println(str);


}

}
