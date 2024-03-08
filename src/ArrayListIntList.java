// London Paris
// IT-CS-143-Lecture-16
import java.util.*;

// IntList interface
interface IntList {
    void add(int value);
    int get(int index);
    int size();
}

class ArrayListIntList implements IntList {
    private static ArrayList<Integer> list;

    public ArrayListIntList(ArrayList<Integer> list) {
        this.list = list;
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

    public void moveFirstToEnd() {
        if (!list.isEmpty()) {
            int first = list.remove(0);
            list.add(first);
        }
    }
}