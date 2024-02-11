import java.util.ArrayList;
import java.util.List;

public class AllProgram {

    public static void main(String[] args) {
        String a = "umbrella";
        String b = "";

        for(int i = a.length()-1; i>=0; i--){
            b=b+a.charAt(i);}

        System.out.println(b);
    }
}
