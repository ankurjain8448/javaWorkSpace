import java.util.*;

class Eight
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Patna; Faridabad# Delhi Mumbai# Bangalore# Chandigarh; Punjab Pune","#;");

System.out.println(st.countTokens());

while(st.hasMoreTokens())
System.out.println(st.nextToken());

System.out.println(st.countTokens());


}

}
