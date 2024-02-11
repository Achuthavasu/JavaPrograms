public class Armstrongnumber {
//    static void solve() {
//        int no = 153;
//        int arm = 0;
//
//        while (no > 0) {
//            int rem = no % 10;
//            arm = arm + (rem * rem * rem);
//            no = no / 10;
//        }
//        {
//            if (arm == no) {
//                System.out.println("given number is an armstrong number");
//            } else {
//                System.out.println("given number is not armstrong number");
//            }
//        }
//    }

//    static void largestnumber(){
//        int [] a = {6,7,8,9,2,3,4};
//     int l=0;
//     for(int i=0; i<6; i++)
//         if(l<a[i]){
//             l=a[i];
//        }
//        System.out.println(l);
//
//    }


    void repeatcheck() {
        String word = "window";
        char a = word.charAt(1);
        boolean repeat =false;
        for (int i = 0; i < 6; i++)
        if (a == word.charAt(i))
        {
                System.out.println( a + " is repeated");
                repeat = true;
                break;}
        if(repeat==false)
        {
            System.out.println
                    ("not repeated");
        }
    }
//
//

    public static void main(String[] args) {

//
        Armstrongnumber d= new Armstrongnumber();
        d.repeatcheck();


    }
}
