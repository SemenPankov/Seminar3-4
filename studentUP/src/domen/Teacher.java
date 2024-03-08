package domen;

/**
 * Класс отвечает за поведение преподавателя
 */
public class Teacher extends WorkingPerson{
    private String degree;

    public Teacher(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Teacher [" + " name = " + super.getName() + " age = " + super.getAge() + "degree="  + degree + "]";
    }   
}