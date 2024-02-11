public class Nestedloop {

    public void hi() {
        for(int j=1; j<=10;j++){
        for (int i = 1; i<=j; i++){
            System.out.print(i);
        }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Nestedloop d = new Nestedloop();
        d.hi();
    }
}
