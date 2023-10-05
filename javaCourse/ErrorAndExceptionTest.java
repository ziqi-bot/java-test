package javaCourse;

import org.junit.Test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ErrorAndExceptionTest {

    public static void main(String[] args) {
//        main(args); stackoverflow error


    }


// **************** runtime exception below *******

    @Test
    public void ArrayIndexOutOfBoundsExceptionTest() {
        int[] arr1 = new int[10];
        System.out.println(arr1[10]);
    }

    @Test
    public void NullPointerExceptionTest() {
        int[][] arr2 = new int[10][];
        System.out.println(arr2[0][0]);
    }

    @Test
    public void ClassCastExceptionTest() {
        Object obj = new Object();
        String str = (String) obj;
    }

    @Test
    public void NumberFormatException() {
        try {
            String str = "123";
            int i = Integer.parseInt(str); // auto-unboxing
            System.out.println(i);
            String str2 = "abc";
            int i1 = Integer.parseInt(str2);
            System.out.println(i1);
        } catch (NumberFormatException e) {
//          e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Done!");
    }

    @Test
    public void InputMismatchExceptionTest() {

        Scanner scanner1 = new Scanner(System.in);

        int num = scanner1.nextInt();
        System.out.println(num);
    }

    @Test
    public void ArithmeticExceptionTest() {
        try {
            int num = 10;
            System.out.println(num / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
//            e.getMessage();
        }
    }


//
    // *******************checked compile exception below编译时异常******************
    @Test
    public void ClassNotFoundException() {
        //  Class clz=Class.forName("java.lang.String");
    }

    @Test

    public void FileNotFoundExceptionandIOExceptionTest() throws FileNotFoundException, IOException {
        File file = new File("C:/hello.txt");
        FileInputStream fis = new FileInputStream(file);// File not found  file input stream使用完必须关闭，fis.close();

        int data = fis.read();//IOException
        while (data != -1) {
            System.out.println((char) data);
//            System.out.println((int)data);
            data = fis.read();
        }
        fis.close();

    }


}
