package javaCourse;

public class scriptTest {

    public static void main(String[] args) {
        person p1 = new person(10, "Harry");
        person p2 = new person();
        person p3 = new student1();

        System.out.println(p1.title);
        System.out.println(p2.title);
        System.out.println(p3 .title);
p3.eat();
//        student s1 = new student();

    }


}

class person {
    int age;
    static String title = "abc";
    String name;

    void eat() {

    }

    public person() {
    }

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class student1 extends person {
    @Override
    void eat() {
        System.out.println("eat as much as you can!");
    }
}


