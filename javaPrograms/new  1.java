import java.util.Scanner;
class abc
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter any String : ");
String a = in.nextLine();
prefix(a);


}

public static void prefix(String a)
{
if(a!=null)
{
System.out.println(a);
}
}

}