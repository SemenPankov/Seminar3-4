package domen;

import java.util.List;
import java.util.Iterator;

/**
 * класс итератор для списка групп студентов в потоке
 */
public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private List<StudentGroup> studentGroupList;

    public StudentGroupIterator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroupList.get(counter++);
    }
}
