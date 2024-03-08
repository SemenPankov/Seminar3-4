package domen;

/**
 * Класс отвечает за поведение студента
 */
public class Student extends Person implements Comparable<Student> {
    private int id;
    
    private static int idGenerator;
    public Student(String name, int age) {
        super(name, age);
        idGenerator ++;
        this.id = idGenerator;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student {" + "id = " + id + " name = " + super.getName() + " age = " + super.getAge() +'}';
    }

    /**
     *
     * @apiNote Метод для сотртировки списка студентов
     * @return возвращает отсортированый список студентов
     */
    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        }else if (this.getAge() < o.getAge()) {
            return -1;
        }else{
            return 0;
        }
    }
}
