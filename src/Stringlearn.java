public class Stringlearn {
//    private static void reverse() {
//        String a = "ABCD";
//        String b = "";
//
//        for (int i = a.length() - 1; i >= 0; i--) {
//            b = b + a.charAt(i);
//        }
//        System.out.println(b);
//        if (a.equals(b))
//            System.out.println("palindrome");
//        else
//            System.out.println("not palindrome");
//
//    }

    static void palindrrome(){
        String a = "abba";
        String b = "";
        for (int i = a.length()-1; i>=0; i--)
        {b=b+a.charAt(i);}
        System.out.println(b);
        if (a.equals(b))

            System.out.println("palindrome");
            else
                System.out.println("not p");


    }
//    static void lowerandupper() {
//        String a = "hello";
//        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1, 5));
//        for (int i = 0; i < a.length(); i++)
//            if (i % 2 == 0) {
//                System.out.print(a.substring(i, i + 1).toUpperCase());
//            } else {
//                System.out.print(a.substring(i, i + 1).toLowerCase());
//            }
//    }
//
//    static void numbers() {
//        String a = "Achutha java 2023";
//        int c =0;
//        for(int i=0; i<a.length(); i++)
//            if(a.charAt(i)>='0' && a.charAt(i)<='9')
//                c++;
//        System.out.println(c);
//        if(a.length()==c)
//            System.out.println("string has only numbers");
//        else System.out.println("no");
//    }
//    static void wordreverse() {
//        String a = "My name is Achutha";
//        String b[] = a.split("   ");
////        for (int i = 0; i < b.length; i++) {
////            System.out.println(b[i]);
////        }
//        for (int i=b.length-1; i>=0; i--)
//            System.out.print(b[i]+" ");
//    }


    public static void main(String[] args) {
      palindrrome();
    }
}






