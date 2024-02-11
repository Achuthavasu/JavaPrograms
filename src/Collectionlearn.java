import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collectionlearn {

    private static void list(){
        List<Integer> l = new ArrayList<>(); //

        l.add(1);
        l.add(6);
        l.add(5);
        Iterator<Integer> a=l.iterator();
        while (a.hasNext()){
            System.out.println(a.next());
        }
    }
    public static void main(String[] args) {
        list();
        }

}
