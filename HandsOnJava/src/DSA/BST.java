package DSA;
import java.util.*;
public class BST extends Working{
	private static Scanner a =new Scanner(System.in);
	public static void main(String[] args) {
		
	
while(true)
{
System.out.println("enter option : ");
System.out.println("1 : create tree \n"
		+ "2 : search an element in tree\n"
		+ "3 : inorder traversal\n"
		+ "4 : preorder traversal\n"
		+ "5 : postorder traversal\n"
		+ "6 : find largest element in tree\n"
		+ "7 : find smallest element in tree\n"
		+ "8 : delete any number from the tree\n"
		+ "9 : successor\n"
		+ "10: predecessor\n"
		+ "11: height\n"
		+ "12: Levelorder traversal\n"
		+ "13: ZigZagOrder traversal\n"
		+ "14:Exit");
int i = a.nextInt();

switch(i)
{
case 1: System.out.println("how many nodes u want to enter..??"); 						
		int n = a.nextInt();
		for(int ji=0;ji<n;ji++)
		insert();
		break;
		
case 2: System.out.println("enter element to be searched : ");							
        int s = a.nextInt();
        if(root == null) System.out.println(" tree is empty");
        else{
        int i1 =search(s);
        if(i1==1) System.out.println(s+ " : is present ");
        else System.out.println(s+ " : is not present ");
        }
        break;
        
case 3: System.out.println("inorder traversal");										
		System.out.println(" Enter the root node of the sub-tree :");
		n = a.nextInt();
		if(root == null) System.out.println(" tree is empty");
		else{
		i = search(n);
		 if(i==1) inorder(temp);
		 else  System.out.println(" number doesnot exist in tree");
		}
 	    break;
       
case 4: System.out.println("preorder traversal");										
		System.out.println(" Enter the root node of the sub-tree :");
		n = a.nextInt();
		if(root == null) System.out.println(" tree is empty");
		else{
		 i = search(n);
		 if(i==1) preorder(temp);
		 else  System.out.println(" number doesnot exist in tree");
		}
 		break;

case 5:	System.out.println("postorder traversal");										
		System.out.println("Enter the root node of the sub-tree :");
		n = a.nextInt();
		if(root == null) System.out.println(" tree is empty");
		else{
		i = search(n);
		 if(i==1) postorder(temp);
		 else  System.out.println(" number doesnot exist in tree");
		}
		break;
 		
case 6:System.out.println("enter the root node for the tree to find maximum element");  
		int j = a.nextInt();
		if(root == null) System.out.println(" tree is empty");
		else{
		i = search(j);
		if(i!=1)System.out.println(" number is not present in tree");
		else{
		j = findMax(temp);
		if(j==-1) System.out.println(" tree is empty");
		else System.out.println(" maximum element in the tree : "+j);
		}
		}
		break;
	
case 7: System.out.println("enter the root node for the tree to find minimum element"); 
		j = a.nextInt();
		if(root == null) System.out.println(" tree is empty");
		else{
		i = search(j);
		if(i!=1)System.out.println(" number is not present in tree");
		else{
		j =	findMin(temp);
		if(j==-1) System.out.println(" tree is empty");
		else System.out.println(" minimum element in the tree : "+j);
		}
		}
		break;
		
case 8:	System.out.println(" enter number to be deleted :");      // not working properly
		int qi = a.nextInt();
		if(root == null) System.out.println(" tree is empty");
		else{
		n = search(qi);
		if(n!= 1) System.out.println(" number is not present in tree ");
		else delete(temp);
		}
		break;
		
case 9: System.out.println("enter the element whose successor u need");                 
		n = a.nextInt();
		if(root == null) System.out.println(" tree is empty");
		else{
		i = search(n);
        if(i!=1)System.out.println(" number is not present in tree");
		else{
        n = successor(temp);
        if(n==-1) System.out.println(" no successor exists");
        else System.out.println("Successor is :"+n);
		}
		}
		break;
	
case 10:   	System.out.println("enter the element whose predecessor u need");
			n = a.nextInt();
			if(root == null) System.out.println(" tree is empty");
			else{
			i =	search(n);
				if(i!=1)System.out.println(" number is not present in tree");
				else{
						n=  predecesssor(temp);
						if(n==-1) System.out.println(" no predecessor exists");
							else System.out.println("predecessor is :"+n);
					}
				}
			break;
	
case 11:    System.out.println("height of the tree : "+heigh());
			break;
			
case 12:	LevelOrder();
			break;
			
case 13:  ZigZagOrder(); 	break;	
		
case 14:  System.exit(0);	

default: 	System.out.println(" wrong option");

}
}

	}
}

class nod
{
	int info;
	nod lchild;
	nod rchild;
}


interface m{
	void insert();//verified
	int  search(int i);//verified
	int  findMax();//verified
	int  findMin();//verified
	void inorder(nod a);//verified
	void preorder(nod a);//verified
	void postorder(nod a);//verified
	void levelorder();
	void delete(nod p);
	void successor(nod i);
	void predecessor(nod i);
	int height(nod i);
	void LevelOrder();
	 void ZigZagOrder();
	
}

class Working
{
	static Scanner in = new Scanner(System.in);
static nod root  = null;
static nod p     = null;
static nod temp  = null;
static nod par   = null;
static nod loc   = null;

static int heigh()
{
	return height(root);
}
static int height(nod temp)
{
	 if (temp==null)   return 0;
	   else
	   {
	     /* compute the height of each subtree */
	     int lheight = height(temp.lchild);
	   //  System.out.println("lheight : "+lheight);
	     
	     int rheight = height(temp.rchild);
	     //System.out.println("rheight : "+rheight);
	     
	     /* use the larger one */
	     if (lheight > rheight){/*System.out.println("up : "+(lheight+1));*/ return(lheight+1); }
	     else{/*System.out.println("down : "+(rheight+1));*/ return(rheight+1); }
	   }
}


static 	void insert()
	{
		System.out.println("Enter info");
		p = new nod();
		p.info = in.nextInt();
		p.lchild=null;
		p.rchild=null;
		int item  = p.info;
		
		if(root == null){root =temp= p; return;}
		search(item);
		if(loc!=null)	{System.out.println(item+" : already present");insert();}
		else
		{
			if(par.info<item) par.rchild = p; 
			else par.lchild = p;			
		}	
	}




static int search(int item)
{
	temp = root;
	
	if(item == temp.info){loc = temp;par= null;}
	while(temp.info!=item)
	{
		par =temp;
		if(item>temp.info){
			
			temp= temp.rchild;
			loc = temp;
			if(loc==null) break;
		}
		if(item<temp.info){
			
			temp = temp.lchild;
			loc = temp;
			if(loc==null) break;
		}		
	}
	
	if(loc== null) return 0;
	else return 1 ;
	
}


static void delete(nod z) // not working only for both child
{
	
	// no child or root
if(z.rchild==null && z.lchild == null) 
{ 
	if(par==null){ z = null;return ;}
	else
	{	if(z == par.lchild){ par.lchild = z.lchild; }
		else { par.rchild  = z.rchild;}
		 return ;
	}
}

//two child
if(z.rchild!=null && z.lchild != null )  
{ 
	successor(z);
	search(temp.info);	
	int a = z.info;
	z.info = temp.info;
	temp.info = a;
	System.out.println("z : "+z.info);
	System.out.println("temp : "+temp.info);
	
	if(par==null)
	{
		System.out.println(" par == null");
		if(temp == par.lchild) par.lchild =  temp.rchild;
		else if(temp == par.rchild) par.rchild = temp.rchild;	
	}
	else
	{   
		System.out.println(" par != null");
		if(temp == par.lchild){ System.out.println("here i am 1.1");par.lchild =  temp.rchild;}
		else if(temp== par.rchild) par.rchild = temp.rchild;		
	}
	return ;
}


// if one child 
	if(par!=null)
	{
		
		if(z == par.lchild)
		{
			if(z.lchild==null && z.rchild!=null) 	par.lchild = z.rchild;
			else if(z.lchild!=null && z.rchild==null) 	par.lchild = z.lchild;
			return ;
		}
		else if(z == par.rchild)
		{
			if(z.lchild==null && z.rchild!=null)	par.rchild = z.rchild;
			else if(z.lchild!=null && z.rchild==null)	par.rchild = z.lchild;
			return ;
		}
	}
	else 
	{ 
		if(z.lchild==null && z.rchild!=null)	{root  = z.rchild;z = null;}
		else if(z.lchild!=null && z.rchild==null){root = z.lchild;z = null;}
		return ;
	}
}

static int findMax(nod p){
	temp = p;
	if(temp==null) return -1;
	while(temp.rchild!=null) temp = temp.rchild;
	int i = temp.info;
	return i;
	
}


static int findMin(nod p){
	temp = p;
	if(temp==null) return -1;
	while(temp.lchild!=null)	temp = temp.lchild;
	int i = temp.info;
	return i;
	}

static int successor(nod tem)
{ 	temp = tem;
	if(temp.rchild!=null) 	return findMin(temp.rchild);
	else
	{
		while(par!=null&&temp==par.rchild)
		{
			temp = par;
			search(par.info);
		}
		if (par==null) return -1;
		else {
			temp = par;
			return par.info;
			}
		
	}
}

		
	static void inorder(nod temp ){
			if(temp!=null)
		{	inorder(temp.lchild);
			System.out.println(temp.info);
			inorder(temp.rchild);
		}		
		}


	static void preorder(nod temp ){
	 if(temp!=null)
		{	System.out.println(temp.info);
			preorder(temp.lchild);			
			preorder(temp.rchild);
		}
		}

	
	static void postorder(nod temp ){
	 if(temp!=null)
		{	postorder(temp.lchild);
			postorder(temp.rchild);
			System.out.println(temp.info);
		}
							}

	static void ZigZagOrder()
	{
		int h = heigh();
		//int count = h%2;
		for(int i = 1;i<=h;i++)
			ZigZag(root , i);
	}
	static void ZigZag(nod temp,int level)
	{
		if(temp==null) return ;
		if(level==1) System.out.println(temp.info);
		else if(level>1&&level%2 == 0)
		{
			ZigZag(temp.lchild,level-1);
			ZigZag(temp.rchild,level-1);
		}
		else if(level>1&&level%2 == 1)
		{
			ZigZag(temp.rchild,level-1);
			ZigZag(temp.lchild,level-1);			
		}
	}
	
	static void LevelOrder()
	{
		int h = heigh();
		for(int i = 1;i<=h;i++)
			level(root , i);
	}
	
	static void level(nod temp,int level)
	{
		if(temp==null) return ;
		if(level==1) System.out.println(temp.info);
		else if(level>1)
		{
			level(temp.lchild,level-1);
			level(temp.rchild,level-1);
		}
	}
	
static int predecesssor(nod tem)
	{
		temp = tem;
		if(temp.lchild!=null) return findMax(temp.lchild);
		while(par!=null&&temp==par.lchild)
		{
			temp = par;
			search(par.info);
		}
		if (par==null) return -1;
		else 
		{
			temp = par;
			return par.info;
		}
	}
}