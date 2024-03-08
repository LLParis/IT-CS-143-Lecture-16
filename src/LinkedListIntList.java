// London Paris
// IT-CS-143-Lecture-16
import java.util.*;

class LinkedListIntList implements IntList {
    private static LinkedList<Integer> list;

    public LinkedListIntList() {
        this.list = new LinkedList<>();
    }

    public void add(int value) {
        list.add(value);
    }

    public int get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
}