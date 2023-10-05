package javaCourse;

public class UserTest {
    public static void main(String[] args) {
        int a = 1;
    }
}
class Customer{
    String name;
    int age;
    boolean isMale;


    public void eat(){
        System.out.println("eat");

    }

    public void sleep( int hour){
        System.out.println("sleep"+ hour+"h");

    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info ="my nationality" +nation;
        return info;
    }

}