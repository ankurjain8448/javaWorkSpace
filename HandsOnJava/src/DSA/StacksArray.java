package DSA;

public class StacksArray {
public static void main(String[] args) {
	
		a obj = new a();
		obj.push(3);
		obj.push(312);
		obj.push(43);
		obj.push(33);
		obj.display();
		obj.push(23);
		obj.display();
		obj.push(13);
		obj.display();
		
		obj.pop();
		obj.pop();
		obj.pop();
		obj.display();
		obj.pop();
		obj.display();
		obj.pop();
		obj.pop();
	}
}

class a
{
	
	static int arr[] = new int[5];
	int top = -1;
	
	
	void push(int n)
	{ 		top  = top +1;
			if(top==arr.length)	System.out.println("Stack overflow");
			else
			{
			arr[top] = n;
			System.out.println("pushing : "+n+"\ttop : "+top);
			}
	}
	
	void pop()
	{
		top= top - 1;
		if(top<0) System.out.println("Stack empty");
		else
		{	System.out.println("popped : "+arr[top]+"\ttop : "+top);
			arr[top]=0;
		}
	}
	
	void display()
	{		
		for(int i = 0;i<arr.length;i++)
		if(arr[i]!=0) System.out.print(arr[i]+"->");
		
		System.out.println(" ");
		
	}
	}