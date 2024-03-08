// London Paris
// IT-CS-143-Lecture-16
import java.util.*;
class CustomList {
    private static List<Integer> list;

    public CustomList(List<Integer> list) {
        this.list = list;
    }

    // Sum Method
    public static int sum() {
        int sum = 0;
        // check for emptiness
        if (list.isEmpty()) {
            return sum;
        }

        // cumulative sum algo
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    // Average Method
    public static double average() {
        double average = 0;
        double sum = 0;
        if (list.isEmpty()) {
            return 0.0;
        }

        for (int num : list) {
            sum += num;
        }
        average = sum / list.size();

        return average;
    }

    // First last method moves first element to the last index and vice versa
    public static void firstLast() {

    }

}


