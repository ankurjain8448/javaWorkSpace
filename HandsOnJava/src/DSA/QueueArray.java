package DSA;

public class QueueArray {

	public static void main(String[] args) {

	b obj = new b();
	obj.insert(1);obj.insert(2);
	obj.display();
	obj.insert(3);obj.insert(4);
	obj.display();
	obj.insert(5);
	obj.display();
	
	obj.delete();obj.delete();obj.delete();
	obj.display();
	obj.delete();
	obj.display();
	obj.delete();obj.delete();

	}
}

class b
{
	static int front = 0,rear = -1;
	static int arr[] = new int[5];
	void insert(int n)
	{ 
		rear++;
		if(rear==5) System.out.println("queue is full");
		else
		{
			arr[rear] = n;
			System.out.println("element inserted : "+arr[rear]+"\tfront : "+front+"\trear : "+rear);
		}		
	}
	
	
	void delete()
	{
		if(front>rear) System.out.println("Queue Empty");
		else
		{
		System.out.println("element deleted : "+arr[front]+"\tfront : "+front+"\trear : "+rear);
		front++;
		}	
	}
	
	
	void display()
	{
		System.out.println("");
		for(int k = front;k<=rear;k++) System.out.print(arr[k]+"->");
		System.out.println("");
	}
}