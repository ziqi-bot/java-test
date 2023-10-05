package javaCourse;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
class PrimeNumberTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int k=0;
        int i = 2;

        while (i <= 100) {
            int j = 2;
            while(j <= i) {
                if (i % j == 0) {
                    if (i==2){
                        System.out.println(i);
                        k++;
                    }
                    i++;
                    break;

                }
                else {
                    j++;
                    if (j == i) {

                        System.out.println(i);
                        k++;





                    }
                }
            }


        }
        long end = System.currentTimeMillis();
        System.out.println("the number of the prime number is\t"+k+"\nsystem running time is\t"+ (end-start));

    }
}


class ArrayTest{
    public static void main (String[] args){
        int[]X=new int[]{1,2,3};
        String[]Y=new String[6];
     System.out.println(X[0]);
     Y[0] = "apple";Y[1] = "apple";Y[2] = "apple";Y[3] = "apple";Y[4] = "apple";Y[5] = "apple";
        System.out.println(Y[0]);
        for (int i=0;i<Y.length;i++){

            System.out.println(Y[i]);
        }


    }


}


class Test{
    public static void main(String[] args){
        int[] arr = new int[]{8,2,1,0,3};
        int[] index=new int[]{2,0,3,2,4,0,1,3,2,3,3};
        //initialize
        String tel="";
        for (int i=0;i<index.length;i++){
            tel+=arr[index[i]];
        }
        System.out.println(tel);

    }
}



class finMax{
    public static void main(String[] args) {
        System.out.println("Number of students");
        Scanner sc = new Scanner( System.in);
        int number = sc.nextInt();
        int[] score = new int[number];
        System.out.println("please type in\t"+number+"\tstudents's scores");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        int maxscore=0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > maxscore) {
                maxscore = score[i];
            }
        }
        System.out.println(maxscore);

    }
}


class twoDemensionArray{
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};// static
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5,2}, {6, 7, 8}};//dynamic
        String[][] arr2 = new String[3][2];
        System.out.println(arr1[1][2]);
        String[][] arr5 = new String[3][2];
        System.out.println(arr5[0] );
    }
}

class arrayTest{
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{2, 3, 4, 5};
        boolean result= Arrays.equals(arr2, arr1);
        System.out.println(result);


        int[] arr = new int[4]; //default value is 0
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}

class findSum {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //outter row structure
            for (int j = 0; j < arr[i].length; j++) {   //arr[i] is the row vector, including many colomuns
                sum += arr[i][j];
            }
        }
        System.out.println("total sum is\t"+sum);

    }
}
    class YangHui {
        public static void main(String[] args){
            int[][] yanghui = new int[10][];

            for (int i = 0; i < yanghui.length; i++) {
                yanghui[i] = new int[i + 1];
                yanghui[i][0]=yanghui[i][i]=1;// first and last elements=1

                if (i > 1) {
                    for (int j = 1; j < yanghui[i].length-1; j++) {
                        yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];//middle elements
                    }
                }
            }

            for (int i = 0; i < yanghui.length; i++) {
                for (int j = 0; j < yanghui[i].length; j++) {
                    System.out.print(yanghui[i][j]+" ");

                }
                System.out.println();
            }
        }


    }

// Java program to demonstrate working
// of java.lang.Math.random() method


class randomNumber {

    // driver code
    public static void main(String args[])
    {
        // define the range
        int max = 30;
        int min = 0;
        int range = max - min + 1;
        int num = 10;
        int [] arr=new int[num];
        int sum = 0;
        // generate random numbers within 1 to 10
        for (int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random() * range) + min; //random number

            // Output is different everytime this code is executed
            System.out.println(arr[i]);
            sum += arr[i];

        }

        System.out.println("sum is\t"+ sum);
        double avg = (double)sum/arr.length;
        System.out.println("avergae is \t"+avg);
    }
}

class BubbleSortTest{
    public static void main(String[] args) {

        int[] arr = new int[]{12, 25, 36, 45, 89, 56, 55,-10,-50,-2,0,23,105,999};


        for (int k=0;k<arr.length-1;k++) {
            for (int j = 0; j < arr.length - 1 - k; j++) {

                if (arr[j] >= arr[j + 1]) {



                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
}

























