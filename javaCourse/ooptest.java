package javaCourse;

public class ooptest {

    public static void main(String[] args) {
        circle c1= new circle(2.1);
        circle c2=new circle(1.1);
        System.out.println(c1);
        System.out.println(c2);

    }
}

class circle{
    private double radius;
    private int id;
    private static int total;

    private static int init=1001;



    @Override
    public String toString() {
        return "javaCourse.circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }

    public circle(double radius) {
        this.radius = radius;
        id=init;
        init++;
    }
}