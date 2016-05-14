package Searching_Techniques;

import java.util.Scanner;

public class linearSearch {
	private static Scanner in;
	public static void main(String[] args) {
int arr[] = {10,1,2,3,4,5,6,7,8,9,0};
System.out.println("enter number to be searched : ");
in = new Scanner(System.in);
int num = in.nextInt();
int flag =0;
for(int i =0;i<arr.length;i++)
{
	if(arr[i]==num) {flag=1;break;}
}

if(flag == 0) System.out.println(num+ " not present");
else System.out.println(num+ " is present");
	}

}
