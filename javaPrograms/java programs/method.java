class p
{
void display()
{
System.out.println("\nIn other class");
}
}

class Methods
{
public static void main(String args[])
{
p obj = new p();
obj.display();
System.out.println(obj);
System.out.println(obj.toString());	/* this method itself calls hashcode 					method..Every class inherits object 	
			class...object class contains methods like toString and 				hashCode and many more....toString method tells the unique identifier....and hashCode method returns the address of the object in integer form

							*/
System.out.println(obj.hashCode());
}
}

