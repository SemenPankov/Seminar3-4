import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controllers.AccountController;
import domen.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        List<Student> students1 = new ArrayList<>();
        Student student1_1 = new Student("Iwan", 26);
        Student student1_2 = new Student("Gadi", 21);
        Student student1_3 = new Student("Awram", 19);
        Student student1_4 = new Student("Zoro", 23);
        Student student1_5 = new Student("Ridik", 20);
        students1.add(student1_1);
        students1.add(student1_2);
        students1.add(student1_3);
        students1.add(student1_4);
        students1.add(student1_5);
        StudentGroup studentGroup1 = new StudentGroup(1, students1);

        List<Student> students2 = new ArrayList<>();
        Student student2_1 = new Student("Gleb", 24);
        Student student2_2 = new Student("Dina", 18);
        Student student2_3 = new Student("Kati", 20);
        Student student2_4 = new Student("Dante", 28);
        Student student2_5 = new Student("Irik", 19);
        students2.add(student2_1);
        students2.add(student2_2);
        students2.add(student2_3);
        students2.add(student2_4);
        students2.add(student2_5);
        StudentGroup studentGroup2 = new StudentGroup(2, students2);

        List<StudentGroup> flow = new ArrayList<>();

        for (Student student : studentGroup1) {
            System.out.println(student);
        }

        System.out.println("----------------------------");
        Collections.sort(studentGroup1.getStudentList());
        for (Student student : studentGroup1) {
            System.out.println(student);
        }

        System.out.println("----------------------------");
        flow.add(studentGroup1);
        flow.add(studentGroup2);
        for (StudentGroup group : flow) {
            System.out.println(group);
        }

        System.out.println("---------------------------------------");
        StudentSteam stream = new StudentSteam(1,flow);
        for (StudentGroup listOfGroup : stream) {
            System.out.println(listOfGroup);
        }
        System.out.println(stream);

        System.out.println("----------------------------------------------");
        Employee worker = new Employee("Василий",38, "разноробочий");
        Teacher teacher = new Teacher("Ольга",55, "доцент");
//        AccountController contr = new AccountController();
//        contr.peySalary(worker, 45000);
//        contr.peySalary(teacher, 77000);
        AccountController.peySalary(worker, 45000);
        AccountController.peySalary(teacher, 77000);

        System.out.println("---------------------------------");
        AccountController.averageAge(students1);
    }
}
