import java.io.*;

class Two
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos=new FileOutputStream("name.txt");

fos.write('N');
fos.write('A');
fos.write('R');
fos.write('A');
fos.write('Y');
fos.write('A');
fos.write('N');

//fos.close();

}

}
