package domen;

/**
 * Класс отвечает за поведение рабочего
 */
public class Employee extends WorkingPerson {
    private String special;

    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Employee [" + "name" + super.getName() + " age = " + super.getAge() + "special=" + special + "]";
    }
}
