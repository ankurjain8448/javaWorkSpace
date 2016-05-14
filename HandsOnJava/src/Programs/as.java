package Programs;

public class as extends w{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     in();
	}

}


class m
{
	int info;
	m lchild;
	m rchild;
}

class w
{
	static 	m p = new m();
	static m p1 = new m();
	static m p2 = new m();
	static m p3 = new m();
	static m p4 = new m();
	static m p5 = new m();
	
	static void in()
	{
		p.info = 0;
		p1.info = 1;
		p2.info = 2;
		p3.info = 3;
		p4.info = 4;
		p5.info = 5;
		p.lchild = p1;
		p.rchild = p2;
		p2.lchild = p3;
		p3.rchild = p4;
		p5 = null;
		System.out.println(p.info);
		System.out.println(p1.info);
		System.out.println(p2.info);
		System.out.println(p3.info);
		System.out.println(p4.info);
		//System.out.println(p5.info);
		
	}
}