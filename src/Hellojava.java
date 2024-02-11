public class Hellojava {
    public void hello(int a, int b) {
        System.out.println(a + b);
    }
    public void hello(int x, int y, int z) {
        System.out.println(x + y + z);
    }
    public static void main(String[] args) {
        Hellojava A = new Hellojava();
        A.hello(6,7);
        A.hello(5,7,9);
    }

}

