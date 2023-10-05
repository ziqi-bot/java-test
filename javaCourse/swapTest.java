package javaCourse;//public class javaCourse.swapTest {
//
//
//    public static void main(String[] args) {
//        int m = 30;
//        int n = 10;
//        Integer M = 30;
//        Integer N = 10;
//        System.out.println("M:" + M + ",N:" + N);
//        System.out.println("m:" + m + ",n:" + n);
//        swap(m, n);
//        Swap(M, N);
//        System.out.println("m:" + m + ",n:" + n);
//        System.out.println("M:" + M + ",N:" + N);
//    }
//
//    public static void swap(int m, int n) {
//        int temp;
//        temp = m;
//        m = n;
//        n = temp;
////        System.out.println("m:" + m + ",n:" + n);
//    }
//
//    public static void Swap(Integer a, Integer b) {
//        Integer temp;
//        temp = a;
//        a = b;
//        b = temp;
////        System.out.println("M:" + m + ",N:" + n);
//    }
//}
//


public class swapTest {

    public static void main(String[] args) {
        Integer m = 30;
        Integer n = 10;
        System.out.println("m:" + m + ",n:" + n);
        swap(m, n);
        System.out.println("m:" + m + ",n:" + n);
    }

    public static void swap(Integer m, Integer n) {
        Integer temp = m;
        m = n;
        n = temp;
        System.out.println("Inside swap method - m:" + m + ",n:" + n);
    }



}
