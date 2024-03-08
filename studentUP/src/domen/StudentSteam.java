package domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс реализует список групп в потоке и работу с ними
 */
public class StudentSteam implements Iterable<StudentGroup>{
    private int streamNumber;
    private List<StudentGroup> listOfGroups ;

    public StudentSteam(int streamNumber, List<StudentGroup> listOfGroups) {
        this.streamNumber = streamNumber;
        this.listOfGroups = listOfGroups;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public List<StudentGroup> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<StudentGroup> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "streamNumber=" + streamNumber +
                ", listOfGroups=" + listOfGroups +
                '}';
    }

    @Override
    public Iterator iterator() {
        return new StudentGroupIterator(listOfGroups);
    }
}
