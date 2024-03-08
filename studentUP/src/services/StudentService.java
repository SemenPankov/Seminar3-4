package services;

import domen.PersonComparator;
import domen.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для работы с даными учеников
 */
public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return this.studentList;
    }

    @Override
    public void created(String name, int age) {
        Student newStudent = new Student(name, age);
        this.studentList.add(newStudent);
        this.count++;
    }

    /**
     * метод для сортировки
     */
    public void sortByFIO(){
//        PersonComparator<Student> comparator = new PersonComparator<>();
//        this.studentList.sort(comparator);
        this.studentList.sort(new PersonComparator<Student>());
    }
}
