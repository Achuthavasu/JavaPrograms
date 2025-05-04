import java.util.*;

public class ArrayPrograms{

//    public static void main(String[] args) {
//
//        List<Integer> l = new ArrayList<>(); //
//
//        l.add(1);
//        l.add(6);
//        l.add(5);
//        Iterator<Integer> a = l.iterator();
//        while (a.hasNext()) {

    //         System.out.println(a.next());
//        }
//    }
//}
         //sorting of an array
//    public static void main(String[] args) {
//        int[] arr = {3, 0, 8, 0, 0, 1, 2};
//
//        Arrays.sort(arr);  // Sorts the array in ascending order
//        //    In Java, arrays don’t override toString().
//        //    So if you just try to System.out.println(arr), it will print something like: [I@6d06d69c
//
//        //     What Arrays.toString(arr) does:
//        //     It converts the contents of an array (like int[]) into a readable string format.
//        //     It returns a string like: [0, 0, 0, 1, 2, 3, 8]
//        //     Arrays.toString() is a static method in the java.util.Arrays class.
//        System.out.println(Arrays.toString(arr));
//    }
//
//    }

     //To find the duplicates in an array
//public static void main(String[] args) {
//
//        int[] arr = {3,1,2,3,4,5,6,7,6};
//        HashSet<Integer>seen = new HashSet<>(); //create two new Hashsets as seen and duplicate.
//        HashSet<Integer>duplicate = new HashSet<>();
//        for (int num : arr) {  // iterating the array to get each number for following action
//            if(!seen.add(num))
//                //since seen set initially do not contain any integer, it will allow to add new number on iterating the array
//                duplicate.add(num); // mean while already existing numbers will be not added in single hashset and gets added in the duplicate hashset
//
//        }
//        System.out.println(seen);
//        System.out.println(duplicate);
//
//}
//}

        //Find All Unique Elements in an Array
//public static void main(String[] args) {
//
//
//    int[] arr = {1, 2, 2, 3, 4, 4, 5};
//    HashMap<Integer, Integer> freq = new HashMap<>(); //Create a HashMap to store frequencies
//    for (int num : arr)
//        freq.put(num, freq.getOrDefault(num, 0) + 1);
//    //If num is already in the map, get its current count and add 1.
//    //If num is not in the map, default its count to 0 and then add 1.
//    System.out.println(freq);
//    // output will be now, {1=1, 2=2, 3=1, 4=2, 5=1}
//    // now we have to count unique keys only
//    //Map.Entry<K, V> is an inner interface of the Map class that allows you to access each key-value pair.
//    //freq.entrySet() returns a set of all entries in the map.
//    for (HashMap.Entry<Integer, Integer> NewMap : freq.entrySet()) {
//        if (NewMap.getValue() == 1)
//            System.out.print(NewMap.getKey() + " ");
//    }
//}
//}

       //        Count Frequency of Each Element
//public static void main(String[] args) {
//
//        int[] arr = {1, 2, 2, 3, 4, 4, 5};
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        for (int num : arr) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        //If num is already in the map, get its current count and add 1.
//         //If num is not in the map, default its count to 0 and then add 1.
//        System.out.println(countMap);
//        for (Map.Entry<Integer, Integer> entr : countMap.entrySet()) {
//            System.out.println(entr.getKey() + " occurs " + entr.getValue() + " time(s)");
//            //Map.Entry<K, V> is an inner interface of the Map class that allows you to access each key-value pair.
//            // countMap.entrySet() returns a set of all entries in the map.
//        }
//
//}
//}
        // To Move All Zeros to the End
public static void main(String[] args) {

        int []arr ={0,4,1,0,5,0};
        int a =0;    // this will help to track the next non-zero position
        for (int i = 0; i<arr.length; i++ )
        if (arr[i]!=0)
        {arr[a++]=arr[i];}
        while (a<arr.length)
        {
        arr[a++]=0;
        }
        // first it will check as arr[0]!=0, if this false then it moves to next as arr[4]! =0,
        // this will be true and index will start to increase from 0 to 1 and array(arr) will
        // start to store as {4...}.
            //to Fill the rest with zeros
        // In the end index will be lesser than actual length of the array, to match the length, we write condition
        // and increase the index until it reached the array length, over there the value will be filled with 0

        System.out.println(Arrays.toString(arr));
    }
}
         //        Find the Missing Number in an Array (1 to N)
//public static void main(String[] args) {
//
//    int[] arr = {1, 2, 4, 5, 6}; // missing 3 and no duplicates, no sorting, range should be maintained
//    //1+2+4+5+6=18 = sum 1
//    //1+2+3+4+5+6 = 21 = sum 2
//    //sum2-sum1 = 3, which is the missing number
//    int sum1 = 0;
//
//    for (int i = 0; i < arr.length; i++) {
//        sum1 = sum1 + arr[i];
//
//
//    }
//    System.out.println("actual sum is " + sum1);
//    int sum2 = 0;
//    for (int i = 1; i <= 6; i++) {
//        sum2 = sum2 + i;
//    }
//    System.out.println("expected sum is " + sum2);
//    System.out.println("missing number is " + (sum2 - sum1));
//}
//}

        // to find the largest number of an array
//public static void main(String[] args) {
//
//    int[] arr = {1, 4, 5, 7, 2, 8, 9, 3, 2};
//    int l = arr[0];
//    for (int i = 0; i <= 8; i++)
//        if (l < arr[i]) {
//            l = arr[i];
//        }
//    System.out.println(l);
//}
//}
   //Java Program: Find Second Largest and Second Smallest number in an array
//        public static void main(String[] args) {
//            int[] arr = {5, 8, 1, 3, 9, 2, 8};
//
//            // Sort the array
//            Arrays.sort(arr);
//
//            // Remove duplicates by using a temporary array
//            int[] unique = Arrays.stream(arr).distinct().toArray();
//            System.out.println(Arrays.toString(unique));
//            //Arrays.stream(arr)->Converts the array arr into a stream of integers.
//            //.distinct()
//            //Filters the stream to remove duplicate elements.
//            //.toArray()
//            //Converts the resulting stream back into an int[] array.
//
//            if (unique.length < 2) {
//                System.out.println("Not enough unique elements to find second largest and second smallest.");
//            } else {
//                int secondSmallest = unique[1];
//                int secondLargest = unique[unique.length - 2];
//
//                System.out.println("Second Smallest: " + secondSmallest);
//                System.out.println("Second Largest: " + secondLargest);
//            }
//        }
//    }

     // To find the sum of elements in an array
//public static void main(String[] args) {
//
//    int[] arr = {1, 4, 5, 7, 2, 8, 9, 3, 2};
//    int sum = 0;
//    for (int i = 0; i <= 8; i++) {
//        sum = sum + arr[i];
//    }
//    //or
//    // for (int num : arr) {
//    //  sum += num;
//    //   }
//    System.out.println(sum);
//}
//}

//        // 10.) To merge two arrays
//public static void main(String[] args) {
//
//    int[] a = {1, 2, 3, 4};
//    int[] b = {4, 5, 6};
//    int newLen = a.length + b.length;
//    int[] c = new int[newLen];
//    int index = 0;
//    for(int num:a){
//        c[index++]=num;
//    }
//    for (int num:b){
//        c[index++]=num;
//    }
//        System.out.print(Arrays.toString(c));
//}
//}

        //or
//public static void main(String[] args) {
//    int[] a = {1, 2, 3, 4};
//    int[] b = {4, 5, 6};
//    int[] c = new int[a.length + b.length];
        //    System.arraycopy() is a built - in method to copy one array into another.
        //    Parameters:
        //    a:Source array (from array)
        //    0:Start from index 0 of a
        //    c:Destination array (To array)
        //    0:Start filling into index 0 of merged
        //    a.length:Number of elements to copy
//    System.arraycopy(a, 0, c, 0, a.length);
//    System.arraycopy(b, 0, c, a.length, b.length);
//    System.out.println(Arrays.toString(c));
//    //sample of simply copy
//    int arr[] = {1, 3, 4, 4};
//    int d[] = new int[4];
//    System.arraycopy(arr, 0, d, 0, arr.length);
//    System.out.println(Arrays.toString(d));
//}
//}


//        // to multiple two arrays
//public static void main(String[] args) {
//        int[]a={1,2,3,4,1};
//        int[]b={4,5,6,3};
//        int[]c=new int [a.length];  //take the biggest arrays's length
//        for(int i=0; i<4; i++)
//        {c[i] = a[i] * b[i];}
//        System.out.println(Arrays.toString(c));
//}}
//        //To add two arrays
//public static void main(String[] args) {
//
//        int[]a={1,2,3,4};
//        int[]b={4,5,6,3};
//        int[]c=new int [a.length];  //take the biggest array length
//        for(int i=0; i<4; i++)
//        {c[i] = a[i] + b[i];}
//        System.out.println(Arrays.toString(c));
//
//    }
//}

