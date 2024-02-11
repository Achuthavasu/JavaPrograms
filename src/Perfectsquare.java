import java.util.Scanner;

public class Perfectsquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        for(int i=2; i<=a/2; i++)
        if( a/i ==i
        )
            System.out.println(a + " is a perfect square");

        }



}
