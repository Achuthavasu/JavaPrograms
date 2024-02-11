public class Childclass extends Father{
    String b = "java";
    Childclass (){
        super("hello");
    }

    Childclass(String p) {
        System.out.println(p);
    }

    String g(){
        return "return current method";
    }
    void h(){
        System.out.println(super.a);
        String n = this.g();
        System.out.println(n);
        System.out.println(this.g());
        System.out.println(super.k());
    }

    public static void main(String[] args) {
        Childclass sub = new Childclass();
        sub.h();
        System.out.println(sub.k());
    }
}
