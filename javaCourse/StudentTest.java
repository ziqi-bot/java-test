package javaCourse;

public class  StudentTest {
    public static void main(String[] args) {

        Student[] Stu = new Student[20];//声明Stu数组为Student类型
        for (int i = 0; i < Stu.length; i++) {
            Stu[i] = new Student();// 给Stu数组赋值

            Stu[i].number = i + 1;//给实例对象Stu[i]的属性（number，state，score，）等赋值
            Stu[i].state = (int) (Math.random() * (6 + 1));
            Stu[i].score = (int) (Math.random() * (100 + 1));
            System.out.println(Stu[i].number + "\t" + Stu[i].state + "\t" + Stu[i].score);
//            System.out.println(Stu[i].info());

//            if (Stu[i].state == 3) {
//                System.out.println(Stu[i].number+"\t"+Stu[i].state+"\t"+Stu[i].score);
//            }
      }

            for (int j = 0; j < Stu.length; j++) {
                for (int i = 0; i < Stu.length - j - 1; i++) {

                    if (Stu[i].score >= Stu[i + 1].score) {
//
                         Student temp = Stu[i];
                        Stu[i] = Stu[i + 1];
                        Stu[i + 1] = temp;
                    }
                }

            }
        System.out.println("New " +
                "      Sort \n");
         for (Student student : Stu) {
            System.out.println(student.number + "\t" + student.state + "\t" + student.score);
        }
            ;

        }


    }

class Student{
    int number; //field
    int state;
    int score;

    public String info(){   //method
        return "id\t"+number+"state\t"+state+"score\t"+score;
    }

}

