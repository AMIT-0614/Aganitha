import java.util.*;
public class program2 {
    public static ArrayList<Integer> dedup(ArrayList<Integer> numberlist)
    {
        int i,j;
        for(i=0;i<numberlist.size()-1;i++)
        {
            for(j=i+1;j<numberlist.size();j++)
            {
                if(numberlist.get(i)==numberlist.get(j))
                {
                    numberlist.remove(j);
                    j--;
                }
            }
        }
        return numberlist;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(2);
        List al1=dedup(al);
        System.out.println(al1);

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(1);
        al2.add(1);
        al2.add(3);
        al2.add(8);
        al2.add(2);
        al2.add(2);
        List al21=dedup(al2);
        System.out.println(al21);

        ArrayList<Integer> al3=new ArrayList<>();
        al3.add(10);
        al3.add(2);
        al3.add(3);
        al3.add(4);
        al3.add(2);
        al3.add(1);
        al3.add(10);
        List al31=dedup(al3);
        System.out.println(al31);

        ArrayList<Integer> al4=new ArrayList<>();
        al4.add(1);
        al4.add(2);
        al4.add(3);
        al4.add(4);
        al4.add(4);
        al4.add(4);
        al4.add(4);
        al4.add(6);
        al4.add(8);
        List al41=dedup(al4);
        System.out.println(al41);

        ArrayList<Integer> al5=new ArrayList<>();
        al5.add(1);
        al5.add(1);
        al5.add(1);
        al5.add(1);
        al5.add(1);
        al5.add(1);
        List al51=dedup(al5);
        System.out.println(al51);
    }
}
