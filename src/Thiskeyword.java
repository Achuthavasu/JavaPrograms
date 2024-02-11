
public class Thiskeyword {
    int a;

    Thiskeyword(int a) {
        System.out.println("local variable before assign " + a);
        System.out.println("local variable before assign " + this.a);
        this.a = a;
        System.out.println("local variable after assign " +a);
        System.out.println("local variable after assign " + this.a);
    }

    void setA(int a) {
        this.a = a;
    }

    int getA() {
        return a;
    }

    public static void main(String[] args) {
        Thiskeyword key = new Thiskeyword(1000);
        System.out.println(key.getA());

    }
}
