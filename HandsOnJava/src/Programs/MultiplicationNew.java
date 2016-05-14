package Programs;

public class MultiplicationNew {
//multiplication of two numbers
	
	public static void main(String[] args) {
	int a = 20;
	int b = 20;
	int c = 0;
	
	if(a%2!=0) c = c+b;
	
	while(a!=1)
	{
	a = a/2;
	b = b + b;
	if(a%2!=0)  c = c+b;
	}
	System.out.println(c);
	}

}
