package services;

import java.util.List;

/**
 * интерфейс для работы с классами обслуживания
 * @param <T>
 */
public interface iPersonService<T> {
    /**
     * Метод для создания списка учащихся и работников учебного учереждения
     * @return List<T>
     */
    public List<T> getAll();

    /**
     * Метод для добавления в список учащихся и работников учебного учереждения
     * @param name
     * @param age
     */
    public void created(String name, int age);
}
