import java.util.HashMap;
import java.util.Map;

public class StringPrograms {
//    public static void main(String[] args) {
//        String a = "ABCBA";
//        String b = "";
//        for (int i = a.length() - 1; i >= 0; i--) {
//            b = b + a.charAt(i);
//
//            // OR
//       // String b= new StringBuilder(a).reverse().toString();
//            //This creates a new StringBuilder object and initializes it with the contents of the string a.
//            //So this is like: StringBuilder sb = new StringBuilder("hello");
//            System.out.println(b);
//            if (a.equals(b))
//                System.out.println("palindrome");
//            else
//                System.out.println("not palindrome");
//        }}

    // To reverse a String
//    public static void main(String[] args) {
//        String a = "Achutha";
//        for (int i = a.length() - 1; i >= 0; i--)
//            System.out.print(a.charAt(i));
//    }
//}
    //To count vowels and consonents in a String
//    public static void main(String[] args) {
//        String A = "Achutha";
//        String a = A.toLowerCase();
//        int v = 0;
//        int c = 0;
//        for (int i = 0; i < a.length(); i++)
//            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' ||
//                    a.charAt(i) == 'u') {
//                v++;
//            } else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
//                c++;
//            }
//        System.out.println(v);
//        System.out.println(c);
//    }
//}
    //To count character occurrence of a string
//    public static void main(String[] args) {
//        String S1 = "ACHUTHA";
//        HashMap<Character, Integer> Count = new HashMap<>();
//        for (int i = 0; i < S1.length(); i++) {
//            char c = S1.charAt(i);
//
//            if (Count.containsKey(c)) {
//                Count.put(c, Count.get(c) + 1);
//            } else {
//                Count.put(c, 1);
//            }
//        }
//        System.out.println(Count);
//    }
//}
    //To reverse the words of the string
//    public static void main(String[] args) {
//        String a = "Hi, hello, how are you";
//        String [] arr = a.split(" ");
//        for(int i =arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+" ");
//        }
//
//    }}
    //To find the count of words in a String
//    public static void main(String[] args) {
//        String a = "Hi, hello, how are you";
//        int Count = 1;
//        for (int i = 0; i < a.length(); i++)
//            if (a.charAt(i) == ' ') {
//                Count++;
//            }
//        {
//            System.out.println("words count is " + Count);
//        }
//    }
//}
    //to write a program to find duplicate words in a string
    public static void main(String[] args) {

        String a = "Java is easy to learn and Java is powerful";

        // Convert the string to lowercase and split it into words
        String[] arr = a.toLowerCase().split(" ");

        // Use a HashMap to count word frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : arr) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);
//
        // Print duplicate words
        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entr : wordCount.entrySet()) //iterating the wordCount map, each set is revealed and can be handled.
        {
            if (entr.getValue() > 1) {
                System.out.println(entr.getKey() + " - " + entr.getValue() + " times");
            }
        }}}


