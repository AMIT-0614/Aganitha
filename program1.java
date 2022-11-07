public class program1 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i++)
        {
            if(i%3==0&&i%5==0)
                System.out.println("amazon");
            else if(i%3==0)
                System.out.println("google");
            else if(i%5==0)
                System.out.println("facebook");
            else
                System.out.println(i);
        }
    }
}
