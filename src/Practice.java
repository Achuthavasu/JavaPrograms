import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void list() {
        List<String> s = new ArrayList<>();
        s.add("add");
        s.add("advertise");
        s.add("adhere");
        s.add("edge");
        s.add("cd");
//        for (int i=0; i<s.size(); i++)
//            System.out.println(s.get(i));
        Collections.reverse(s);
        System.out.println(s);

    }
  public static void main(String[] args) {
        list();



        }
    }
