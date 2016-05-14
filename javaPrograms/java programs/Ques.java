import java.util.*;

class Ques
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
String s = in.nextLine();
int l =s.length();
//'0'-->>48-->'9'-->>57
int n= 1,sum = 0,flag = 0,last = 0,w=0,d=0;
for(int i=l-1;i>=0;i--)
{
int p =s.charAt(i);
if((p>47)&&(p<58))
{
w=0;p =p-48;
if(flag == 0) {sum= sum +p; flag ++;}
else{n = n*10;sum = sum + p*n;}
}
else
{ n  = 1;w = 0;
if(w==0) {d =d+ sum;w++;}
}

}
System.out.println(d);
}
}