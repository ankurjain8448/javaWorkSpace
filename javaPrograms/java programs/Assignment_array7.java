//Accept ten elements into an int array and shift all the even numbers to the beginning.

import java.util.*;

class Assignment_array7fn7
{
void know()
{
Scanner in = new Scanner(System.in);
int arr[]= new int[7];
int arrnew[] = new int[7];
int j=0;
System.out.println("Enter 7 elements in array");
for(int i=0;i<7;i++)
{arr[i]=in.nextInt();
if(arr[i]%2==0)
{arrnew[j]=arr[i];
j++;}
else
arrnew[6-j]=arr[i];
}
System.out.println("In arranged order");
for(j=0;j<7;j++)
System.out.println(arrnew[j]);

}


}


class Assignment_array7
{
public static void main(String[] args)
{

Assignment_array7fn7 obj =  new Assignment_array7fn7();
obj.know();

}
}

