public class Wrapperclass {
    public static void main(String[] args) {
        int a = 100;
        Integer k = Integer.valueOf(a); //wrapping
        int l=k.intValue(); //unwrapping
        System.out.println(k.getClass()); //prints the class of integer
        String s= "787";
        int i = Integer.parseInt(s); //string is converted into integer
        System.out.println(i);
        System.out.println(s.getClass());
        System.out.println(i+l); //787+100

    }
}
