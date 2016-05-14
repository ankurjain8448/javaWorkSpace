import java.io.*;

class Ten
{
public static void main(String args[]) throws IOException
{
FileInputStream fis=new FileInputStream(args[0]);
StreamTokenizer st=new StreamTokenizer(fis);

int k,wc,nc;
k=wc=nc=0;

while((k=st.nextToken())!=st.TT_EOF)
{
if(k==st.TT_WORD)
System.out.println("Word "+ ++wc +" ="+st.sval);
else if(k==st.TT_NUMBER)
System.out.println("number "+ ++nc +" ="+(int)st.nval);
}

}

}
