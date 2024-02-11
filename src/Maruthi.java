public class Maruthi extends Abstractlearn{

    void cylinder(int b) {
        System.out.println("using maruthi cylinder " + b);
    }
    void piston(int a){
        System.out.println("generalised piston " + a);
    }

    public static void main(String[] args) {
        Abstractlearn d = new Maruthi();
        d.cylinder(6);
        d.piston(7);
    }
}
