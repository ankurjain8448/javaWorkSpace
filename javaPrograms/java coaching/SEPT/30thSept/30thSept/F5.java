import java.io.*;


class F5
{
public static void main(String args[]) 
{

File f1=new File(args[0]);

File str[]=f1.listRoots();

for(File s:str)
System.out.println(s);


}

}

