public class Fibrocci {

    public static void main(String[] args) {
            int f=0;
            int s = 1;
            int t=0;
            int a =5;
            System.out.println(f);
            System.out.println(s);
            for(int i=0; i<=a; i++)
           {t=f+s;
                f=s;
                s=t;

        System.out.println(t);
      }
    }
}
