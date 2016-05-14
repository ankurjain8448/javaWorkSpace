package xtra;


/*//one way
public class ThreadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
download x = new download("x");
x.start();

download y = new download("y");
y.start();
	}

}

class download extends Thread
{
	
	String u = "";
	download(String u )
	{
		this.u = u;
	}
	
	public void run()
	{
		for(int i = 0;i<100;i++)
			System.out.println(u+" : "+i);
	}
}
*/


// other way
public class ThreadConcept {

	public static void main(String[] args) {
	
	//	System.out.println(i);
		
/*download m = new download();
Thread x = new Thread(m,"one");
x.start();

Thread y = new Thread(m,"two");
y.start();*/
		
	}

}

class download implements Runnable
{	
	public void run()
	{
		for(int i = 0;i<100;i++)
			System.out.println(Thread.currentThread()+" : "+i);
	}
}