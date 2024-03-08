package controllers;

import domen.Person;
import domen.WorkingPerson;

import java.util.List;

/**
 * Метод для реализации контроля аспектов работы и учёбы
 */
public class AccountController {
    /**
     * Метод для учёта зарплаты рабочего персонала
     * @param person
     * @param salary
     * @param <T>
     * @param <V>
     */
    public static   <T extends WorkingPerson, V> void peySalary(T person, V salary){
        System.out.println(person.getName() + " выплаченная зарплата " + salary);
    }

    /**
     * Метод для подчёта среднего возраста
     * @param ageList
     * @param <T>
     */
    public  static <T extends Person> void averageAge(List<T> ageList){
        int sum = 0;
        for (int i = 0; i < ageList.size(); i++) {
            sum += ageList.get(i).getAge();
        }
        System.out.println("средний возраст" + sum / ageList.size());
    }
}
