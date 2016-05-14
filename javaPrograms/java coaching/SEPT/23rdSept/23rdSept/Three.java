import java.io.*;

class Three
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos=new FileOutputStream("student.txt");

fos.write(65);
fos.write(66);
fos.write(67);
fos.write('5');
fos.write('7');
fos.write('8');

fos.close();

}

}
