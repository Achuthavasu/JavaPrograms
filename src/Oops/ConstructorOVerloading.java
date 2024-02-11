package Oops;

// constructor is special kind of method
// constructor name should same as class name
// constructor  will not retrun any value
//constructor will be invoked at the time of object creation, so no need to call the constructor explicitly
// constructor will take the parameters just like a method
// no code or logic is required within the constructor, it is used to only initialize the value during the run time
// two type of constructor- i) default constructor, ii) paramterized constructor

public class ConstructorOVerloading {

    int a =0;
    int b =0;
    double c=0;

    ConstructorOVerloading()
    {a=10;
        b=4;
        c=4.5;

    }
    ConstructorOVerloading(int a, int b)
    {    this.a=a;
        this.b=b;
            }
    ConstructorOVerloading(int i, double j)
    {   a=i;
        c=j;
    }
    ConstructorOVerloading(int m, int n, double o)
    { a=m;
      b=n;
      c=o;
    }

    ConstructorOVerloading(int m, double n, int o)
    { a=m;
        b= (int) n;
        c=o;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        ConstructorOVerloading co = new ConstructorOVerloading(); // calls first constructor
        co.display();

        ConstructorOVerloading bo = new ConstructorOVerloading(2,7); // second constructor
        bo.display();
        ConstructorOVerloading mo = new ConstructorOVerloading(5,5.5); // third constructor
        mo.display();
        ConstructorOVerloading no = new ConstructorOVerloading(6,7,8.9); // forth constructor is called
        no.display();
        ConstructorOVerloading lo = new ConstructorOVerloading(6,7.9,8); // forth constructor is called
        lo.display();

    }
}
