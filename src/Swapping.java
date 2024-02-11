public class Swapping {

    static void withvariable(){
        int a=5;
        int b=10;
        int temp;

        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    static void withoutvariable(){
        int a=5;
        int b=10;

        a=a+b;

        b=a-b;

        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
//

        withoutvariable();
    }
}
