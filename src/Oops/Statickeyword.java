package Oops;
//once variable or method is declared as static, a separate location is created.
//If mentioned as static, it will become common, can be accessed directly without object creation throughout the whole class.
//resuability
//can avoid duplication variables or methods
//static variables and methods are shared across all the objects.
//can be directly accessed throughout the class name.
//static method can only access static stuff(directly)
//non static method can access all nonstatic and static variables and methods
public class Statickeyword {

    int a; //non static variable, cannot be accessed directly
    static int b; // static variable

    void m1(){
        System.out.println("this is non static method");
    }

    static void m2(){
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        b=100;
        System.out.println(b);
        m2();
        Statickeyword st = new Statickeyword();
        st.a = 50;
        st.m1();
        System.out.println(st.a);

    }
    void m3(){             // nonstatic method, which can allow to access all non and static methods and variables

        a=50;
        b=60;
        m2();
    }



}
