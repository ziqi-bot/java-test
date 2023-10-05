package javaCourse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchTest {
    public static void main(String[] args) {
//        int i = 1;
//        while (i < 10) {
            try {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Input number:");
                int num = scanner1.nextInt();
                System.out.println("the number is:" + num + "\n");
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch Exception!!!Numbers only!!!\n");

            } finally {
//                i++;
            }

//        }
    }
}
