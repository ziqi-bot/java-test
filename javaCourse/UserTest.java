package javaCourse;

import org.junit.Test;

import java.util.*;

public class UserTest {
//    public static void main(String[] args) {
//
////    StringBuilder stringBuilder=new StringBuilder("abcdefghijk");
////    stringBuilder.append("aaaaa");
////        System.out.println(stringBuilder);
////        LocalDate ld=LocalDate.now();
////
////        System.out.println(ld);
//        String[] sb = new String[6];
//        sb[0] = "a";
//
//    }

    @Test
    public void test1() {


        class Person implements Comparable<Person> {
            private String name;

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            private int age;

            @Override
            public String toString() {
                return this.name + " " + this.age;
            }

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Person other) {
                // Compare based on name
                return this.name.compareTo(other.name);
            }


            // Getter methods for name and age
        }

        Person p1 = new Person("tom", 15);
        Person p2 = new Person("jerry", 13);

        ArrayList arrayList = new ArrayList();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(new Person("harry",30));

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1=(Person)o1;
                    Person p2=(Person)o2;
                    return -(p1.age-p2.age);
                }
                throw new RuntimeException("not match");



            }
        };
        arrayList.sort(comparator);
        System.out.print(arrayList);


    }


}