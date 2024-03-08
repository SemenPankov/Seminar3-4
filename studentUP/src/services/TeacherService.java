package services;

import domen.PersonComparator;
import domen.Student;
import domen.Teacher;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс для работы с даными преподавателей
 */
public class TeacherService implements iPersonService<Teacher>{
    private int count;
    private List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }


    @Override
    public List<Teacher> getAll() {
        return this.teacherList;
    }

    @Override
    public void created(String name, int age) {
        Teacher newTeacher = new Teacher(name, age, "не получена");
        this.teacherList.add(newTeacher);
        this.count++;
    }
    /**
     * метод для сортировки
     */
    public void sortByFIO(){
//        PersonComparator<Student> comparator = new PersonComparator<>();
//        this.teacherList.sort(comparator);
        this.teacherList.sort(new PersonComparator<Teacher>());
    }
}
