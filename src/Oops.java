public class Oops {
    int a;
    int b;

    //method may not takes paramters//

//    void sum()
//    {
//        System.out.println(a+b);
//    }

//    void sum(int x, int y)
//    {
//        a=x;
//        b=y;
//        System.out.println(a+b);
//    }
int sum()
{
    return (a+b);
}

    public static void main(String[] args) {

        Oops op = new Oops();
        op.a = 100;
        op.b = 200;
        op.sum();
        int m= op.sum();
        System.out.println(m);


    }
}
