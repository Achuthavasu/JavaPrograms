import java.util.ArrayList;
import java.util.List;

public class AllProgram {
    //      //To check the number is a prime number
//    public static void main(String[] args) {
//        int a = 24584;
//        if (a % 2 == 0) {
//            System.out.println(a + " is a prime number");
//        } else {
//            System.out.println("it is not");
//        }
//
//    }
//}
    //To find factorial multiplication of given number
//    public static void main(String[] args) {
//        int number = 5;
//        int factoral = 1;
//        for (int i = 1; i <= number; i++) {
//            factoral = factoral * i;   // 1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120.
//        }
//        System.out.println(factoral);
//
//    }
//}
    //output is 120
//
    // To reverse the given number
//   public static void main(String[] args) {
//   int number =349359;
//   int reversed = 0;
//   int reminder;
//       while (number !=0)
//   {reminder = number % 10;
//       reversed = reversed * 10 + reminder;
//       number /= 10;
//
// //     number = number/10; (above statement is same as number/=10)
//   }
//       System.out.println(reversed);
//
//   }


    //To check the number is palindrome
//    public static void main(String[] args) {
//        int number = 9543459;
//        int backup = number;
//        int reversed = 0;
//        int reminder;
//        while (number != 0) {
//            reminder = number % 10;
//            reversed = reversed * 10 + reminder;
//            number /= 10;
//            //number = number/10; (above statement is same as number/=10)
//        }
//        System.out.println(reversed);
//        if (reversed == backup) {
//            System.out.println(reversed + " is palindrome");
//        } else System.out.println("no");
//    }
    // To check the number of digits in a number
//    public static void main(String[] args) {
//        int number = 9543;
//        int count = 0;
//        while (number != 0) {
//            number = number / 10;
//            count++;
//        }
//        //   9543/10=954.3, 954/10=95.4, 95/10=9.5 this continuous until the number reaches 0
//        //   the steps taken will be counted in the variable count
//        System.out.println(count);
//    }
//}
    //  To get sum of all number in a big number
//    public static void main(String[] args) {
//        int number = 9543;
//        int sum = 0;
//        while (number != 0) {
//            int rem = number % 10;
//            sum = sum + rem;
//            number = number / 10;
//        }
//
//        System.out.println(sum);
//
//    }
//}

    //To swap two numbers between two integers without 3rd variable
//    public static void main(String[] args) {
//        int a = 20;
//        int b = 30;
//
//        a = a + b;    //20+30 = 50
//        b = a - b;    //b=50-30 = 20
//        a = a - b;    //a=50-20 = 30
//
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//}
    //To generate Fibonacci Series
//    public static void main(String[] args) {
//        int first = 0;
//        int second = 1;
//        int third = 0;
//        int num = 10;  // upto 10th series we want
//
//        System.out.println(first);
//        System.out.println(second);
//        for (int i = 0; i <= num; i++) {
//            third = first + second;
//            first = second;      // assigning second number as first number for the next iteration
//            second = third;      // assigning third number as second number for the next iteration
//            System.out.println(third);
//        }
//    }
//}
    // to find given number is an armstrong number
    public static void main(String[] args) {
        int no = 153;
        int arm = 0;
        int backup = no;

        while (no > 0) {
            int rem = no % 10;
            arm = arm + (rem * rem * rem);
            no = no / 10;
        }
        {
            if (arm == backup) {
                System.out.println("given number is an armstrong number");
            } else {
                System.out.println("given number is not armstrong number");
            }
        }
    }

    }


