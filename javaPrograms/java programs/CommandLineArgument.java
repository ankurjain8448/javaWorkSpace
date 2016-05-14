class CommandLineArgument
{
public static void main(String args[])
{
System.out.println(args.length);
for(int i=0;i<args.length;i++)
System.out.println(args[i]);

int num = Integer.parseInt("12");//converting string into integer...
System.out.println(num-1);
}
}