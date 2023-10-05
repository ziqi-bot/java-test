package javaCourse;

import javaCourse.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 25, 14, 3, 56, 89, -99, -50};
        int max=util.getMax(arr);
        System.out.println("max value is "+util.getMax(arr));
    }
}
