package javaCourse;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Create an instance of javaCourse.SwapNumbers class
        SwapNumbers swapper = new SwapNumbers();

        // Call the non-static swap method on the instance
        swapper.swap(num1, num2);

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    // Non-static swap method
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}