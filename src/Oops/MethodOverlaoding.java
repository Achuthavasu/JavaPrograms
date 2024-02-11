package Oops;

public class MethodOverlaoding {

    int a;
    int b;

    void sum(){
        a=10;
        b=20;
        System.out.println(a+b);
    }
    void sum(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);;
    }
    void sum(int m, int n, int o)
    {
        System.out.println(m+n+o);
    }
    void sum(int i, double j)
    {
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        MethodOverlaoding mo  = new MethodOverlaoding();
        mo.sum(); // first method is called
        mo.sum(100,200); // second method is caleld
        mo.sum(5,6,7); // third method is called
        mo.sum(8,9.3); // forth methos is called

    }

}
// interview question - can we overload main method:
// ans -we can also overlaod main method:
// public static void main(String[] args)
//with different parameter it can be created
