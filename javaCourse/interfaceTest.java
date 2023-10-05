package javaCourse;

public class interfaceTest {
    public static void main(String[] args) {
        System.out.println("Min_speed ="+flyable.Min_speed);
        bullet b1= new bullet();
        b1.fly();
        b1.attack();

        plane p1= new plane();
        flyable f1= new plane(); // 多态性，
        f1.fly();
        p1.fly();
    }


}

interface flyable {
    public static final int Min_speed = 10;
//    public static final 可省略
    int Max_speed = 100;

    void fly();

}
interface attackable{
    void attack();

};


class plane implements flyable {
    @Override
    public void fly() {
        System.out.println("javaCourse.plane fly");
    }
}

class bullet implements flyable,attackable {  //接口可以多继承，与类不同

    @Override
    public void fly() {
        System.out.println("javaCourse.bullet fly");
    }

    @Override
    public void attack() {
        System.out.println("javaCourse.bullet attack");
    }
}

