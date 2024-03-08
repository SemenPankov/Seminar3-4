package domen;

import java.util.Comparator;

/**
 * метод проводит сортировку работников учебного заведения
 * @param <T>
 */
public class PersonComparator<T extends  Person> implements Comparator<T> {
    /**
     * Метод сортировки по именам
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
