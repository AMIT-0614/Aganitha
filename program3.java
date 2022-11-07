import java.util.*;
public class program3 {
    public static String countWords(String str)
    {
        int i,j,k=0;
        String s[]=str.split(" "),s1="";
        int l=s.length;
        ArrayList<String> hs=new ArrayList<>();
        ArrayList<Integer> hs1=new ArrayList<>();
        for(i=0;i<l;i++)
        {
            int c=0;
            for(j=i;j<l;j++)
            {
                if(s[i].equalsIgnoreCase(s[j]))
                    c++;
            }
            if(!hs.contains(s[i]))
            {
                hs.add(s[i]);
                hs1.add(c);
            }
        }
        for(i=0;i<hs.size();i++)
        {
            s1+=hs.get(i)+" "+hs1.get(i)+"\n";
        }
        return s1;
    }
    public static void main(String[] args) {
        String s="abc abc uyt hyd abc hyd jht";
        String s1=countWords(s);
        System.out.println(s1);
    }
}
