class Tc
{
public static void main(String args[])
{
		// int num=5.7  ----> Compile time Error



int num=5;	//<------------------|
double k=num;	//		     |implicit casting(Type promotion)
System.out.println(k);	//<----------|

//================================================================================
// TYPE CASTING EXAMPLES


double p=6.7;
int l=(int)p;
System.out.println(l);


char ch='A';
int code =ch;
System.out.println(code);


System.out.println((char)98);


}
}
