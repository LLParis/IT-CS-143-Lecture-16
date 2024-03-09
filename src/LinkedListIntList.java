// London Paris
// IT-CS-143-Lecture-16
import java.util.*;

class LinkedListIntList implements IntList {
    private LinkedList<Integer> list;

    public LinkedListIntList() {
        this.list = new LinkedList<>();
    }

    public void add(int value) {
        list.add(value);
    }

    public int get(int index) {
        if (list.isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
    public void moveToEnd() {
        if (!list.isEmpty()) {
            int first = list.remove(0);
            list.add(first);
        }
    }
    @Override
    public String toString() {
        return list.toString();
    }
}