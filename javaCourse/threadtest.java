package javaCourse;

import org.junit.Test;

/********** 继承于线程的类可以直接用类的对象启动start，而实现runnable接口的类的对象需要被 new thread（）调用，然后再start **************/

public class threadtest extends Thread {

    static int i = 100;
    static Object obj = new Object(); //only one  obj with static

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj) { //obj only one, this is only one in the case. and synchronized() can be regard as lock of room,
                // other threads have to wait until the door unlocked

                if (i > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    i--;
                } else {
                    break;
                }
            }

        }
    }



    public static void main(String[] args) {

        Dog dog = new Dog();
        threadtest threadtest1 = new threadtest();
        threadtest threadtest2 = new threadtest();
        threadtest1.setName("window 1");
        threadtest2.setName("window 2");

        threadtest1.start();
        threadtest2.start();


    }
}

class Dog {

}


//public class threadtest implements Runnable {
//    int i = 100;
//    Object obj = new Object();
//
//    @Override
//    public void run() {
//
//
//        while (true) {
//
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            synchronized (this) { //obj only one, this is only one in the case. and synchronized() can be regard as lock of room,
//                // other threads have to wait until the door unlocked
//
//                if (i > 0) {
//
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + ": " + i);
//                    i--;
//                } else {
//                    break;
//                }
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        threadtest t1 = new threadtest();
//        Thread th1 = new Thread(t1);
//        Thread th2 = new Thread(t1);
//
//        th1.setName("window 1");
//        th2.setName("window 2");
//
//        th1.start();
//        th2.start();
//    }
//}

//public class threadtest {
//    public static void main(String[] args) {
//
//
//        new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println(Thread.currentThread().getName() + " anonymous run");
//                    }
//                }
//        ) {
//        }.start();
//
//
//    }
//
//
//}

// Define an interface
//interface MyInterface {
//    void myMethod();
//}
//
//class Main {
//    public static void main(String[] args) {
//        // Create an anonymous inner class that implements MyInterface
//        new MyInterface() {
//            @Override
//            public void myMethod() {
//                System.out.println("Anonymous inner class method is called");
//            }
//        };
//
//
//    }
//}
