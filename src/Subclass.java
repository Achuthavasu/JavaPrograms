public class Subclass {
    String g(){
        return "return current method";
    }
    void h(){
        String k = this.g();
        System.out.println(k);
        System.out.println(this.g());
    }

    public static void main(String[] args) {
        Subclass l = new Subclass();
        l.h();
        l.g();
    }
}
