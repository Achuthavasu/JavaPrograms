public class Forloop {

    static void even() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        even();
    }
}