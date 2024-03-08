package services;

import domen.Employee;
import domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс для работы с даными работников
 */
public class EmployeeService implements iPersonService<Employee>{
    private int count;
    private List<Employee> employeeList;

    public EmployeeService() {
        this.employeeList = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeList;
    }

    @Override
    public void created(String name, int age) {
        Employee newEmployee = new Employee(name, age, "разноробочий");
        this.employeeList.add(newEmployee);
        this.count++;
    }
    /**
     * метод для сортировки
     */
    public void sortByFIO(){
//        PersonComparator<Student> comparator = new PersonComparator<>();
//        this.employeeList.sort(comparator);
        this.employeeList.sort(new PersonComparator<Employee>());
    }
}
