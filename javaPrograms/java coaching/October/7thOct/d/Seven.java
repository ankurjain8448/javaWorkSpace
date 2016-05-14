import java.util.*;

class Seven
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Patna; Faridabad# Delhi Mumbai# Bangalore# Chandigarh; Punjab Pune","#;");

while(st.hasMoreTokens())
System.out.println(st.nextToken());

//delimiter

}

}
