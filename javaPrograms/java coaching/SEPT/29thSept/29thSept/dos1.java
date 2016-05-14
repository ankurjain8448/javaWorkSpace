import java.io.*;


class DOS1
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos=new FileOutputStream(args[0]);
DataOutputStream dos=new DataOutputStream(fos);

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

char ch='y';

while((ch=='y')||(ch=='Y'))
{
System.out.println("Enter ur name plz...");
String name=br.readLine();

System.out.println(name +" enter the roll plz...");
int roll=Integer.parseInt(br.readLine());

System.out.println(name +" r u normal ?");
boolean isNormal=Boolean.parseBoolean(br.readLine());

dos.writeInt(roll);
dos.writeUTF(name);
dos.writeBoolean(isNormal);

System.out.println("Enter y to continue ");
ch=br.readLine().charAt(0);

}

dos.close();
fos.close();

}

}

