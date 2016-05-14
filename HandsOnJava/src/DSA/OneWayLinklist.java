package DSA;
import java.util.*;

public class OneWayLinklist {
	private static Scanner cv;
		public static void main(String[] args) throws Exception {
	
		cv = new Scanner(System.in);	
		work obj = new work();
		obj.create();
		do{
		  System.out.println("\nfunctions to be performed on linklist ");
		  System.out.println(" display      : 1");
		  System.out.println(" search       : 2");
		  System.out.println(" insert       : 3");
		  System.out.println(" delete       : 4");
		  System.out.println(" reversePrint : 5");
		  System.out.println(" ActualReves  : 6");
		  System.out.println(" exit         : 7");
		int j = cv.nextInt();
		switch(j)
		{
		case 1: obj.display(); break;
		
		case 2: System.out.println("\nEnter the element to be searched: ");
		        int s = cv.nextInt();
		        obj.search(s); break;
			
		case 3: obj.insert(); break;
		
		case 4: obj.delete(); break;
		
		case 5: obj.reversePrint(); break;
		
		case 6: obj.actualRev();break;
		
		case 7: System.exit(1);
		
		}
		
		}while(2>1);
		

	}

}

interface i
{
	void create() throws Exception;
	void display()throws Exception;
	void delete()throws Exception;
	void search(int x)throws Exception;
	void insert()throws Exception;
	void reversePrint()throws Exception;
	void actualRev()throws Exception;
}


class node
{
	int info;
	node link;
}

class work implements i
{
	Scanner in = new Scanner(System.in);
	node start,temp,p;
	
	public void actualRev()
	{	// TODO Auto-generated method stub
		 ptr = temp = start;
		 actualRevese(temp,ptr);
		 ptr.link = null;	 
	}
	public void actualRevese(node temp,node ptr)
	{
		if(temp.link==null)
		{
			temp.link = ptr;
			start = temp;
		}
		else
		{
			ptr = temp;
			temp= temp.link;
			actualRevese(temp,ptr);
		}
		temp.link = ptr;
	}
	
	public void create() throws Exception
	{
		start = null;
		char c ='y';
		do{
			p = new node();
			System.out.println("enter info : ");
			p.info = in.nextInt();
			if(start == null) start = temp = p;
			else
			{
			temp.link=p;
			temp = p;				
			}			
			
			System.out.println("do u want to continue..?");
			c= in.next().charAt(0);
			
		}while(c=='y'||c=='Y');
		temp.link=null;
			
	}
	
	public void reversePrint() throws Exception
	{
		temp = start;
		rev(temp);
		System.out.print(temp.info);
	}

	public void rev(node temp)
	{ 	
		if(temp.link==null)return ;
		else
		    {	temp = temp.link;
				rev(temp);			
			}
		System.out.print(temp.info+"--> ");
	}
	
	public void insert() throws Exception
	{
		System.out.println("insert at beginning      : 1");
		System.out.println("insert after the element : 2");
		int i = in.nextInt();
		System.out.println("element u want to insert : ");
		int n = in.nextInt();
		node p = new node();
		p.info = n;
		switch(i)
		{
		case 1:
				p.link=start;
				start=p;
			    break;
		case 2:
			    System.out.println("enter the element after which u want to insert : ");
			    int num = in.nextInt();
			    search(num);
			    ptr0 = ptr.link;
			    p.link = ptr0;
			    ptr.link = p;
			    break;
			}
		
	}
	
	
	public void delete() throws Exception
	{
		System.out.println("enter the number to be deleted from the link-list :");
		int del = in.nextInt();
		search(del);
		if(ptr.info==start.info)
		{
			ptr0=ptr0.link;
			ptr.link=null;
			start = ptr0;		
		}
		else	ptr0.link=ptr.link;
		
		System.gc();
	}
	node ptr;//for searching
	node ptr0;// previous node of ptr
	
	public void search(int x) throws Exception
	{
		ptr = new node();
		ptr0 = new node();
		ptr0 = ptr = start;
		int flag=0;
		while(ptr!=null)
		{
		if(ptr.info==x){ flag=1; break;}
		else{
			ptr0 = ptr;
			ptr = ptr.link; 
		    }		
		}
		if(flag==1) System.out.println("number is present");
		else System.out.println("number is not present");
	}
	
	
	public void display() throws Exception
	{
		temp = start;
		while(temp.link!=null)
		{
			System.out.print(temp.info+"-->");
			temp = temp.link;
		}
		System.out.print(temp.info+"-->");
		System.out.print("null");
	}
	
	
	
}