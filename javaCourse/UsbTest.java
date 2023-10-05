package javaCourse;

public class UsbTest {
    public static void main(String[] args) {
        Computer c1= new Computer();
        Printer p1= new Printer();
        Printer p2 =new Printer();
        //javaCourse.Usb usb= new javaCourse.Printer();
        //javaCourse.USBC usb = new javaCourse.Printer();
        c1.dataTransfer(p1);
        c1.DataTransfer(p2);
    }
}

class Printer extends USBC implements Usb{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}


class Computer{
    public void  DataTransfer(USBC usb){
        System.out.println("连接成功");
        usb.start();

        usb.stop();
        System.out.println("断开连接");
    }
    public void dataTransfer(Usb usb){

        System.out.println("连接成功");
        usb.start();

        usb.stop();
        System.out.println("断开连接");

    }
}

class USBC{
    void start() {

    }

    void stop() {
    }
}
interface Usb{
    void start();
    void stop();
}