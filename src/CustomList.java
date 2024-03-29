// London Paris
// IT-CS-143-Lecture-16
import java.util.*;

class CustomList {
    private List<Integer> list; // Changed to non-static

    public CustomList(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }
    public void add(int value) {
        list.add(value);
    }
    public Object remove(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return list.remove(index);
    }

    // Sum Method
    public int sum() { // Changed to non-static
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
    public double average() { // Changed to non-static
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

    public int size() { // Changed to non-static
        return list.size();
    }

    public void doubleList() {
        if (list.isEmpty()) {
            return;
        }

        int size = list.size();
        List<Integer> newList = new ArrayList<>(); // Create a new list to store the doubled elements
        for (int i = 0; i < size; i++) {
            newList.add(list.get(i)); // Append elements from the original list to the new list
            newList.add(list.get(i)); // Append elements from the original list again to double them
        }
        list.clear(); // Clear the original list
        list.addAll(newList); // Update the original list with the doubled elements
    }
    public void rotate() {
        if (list.size() > 1) {
            list.add(list.remove(0));
        }
    }
    public void surroundWith(int x, int y) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                // Insert y before and after the current index
                list.add(i, y);
                i++; // Skip the newly added y
                list.add(i + 1, y);
                i++; // Skip the x value which was just surrounded
            }
        }
    }
    public void reverse() {
        int left = 0; // start of the list
        int right = list.size() - 1; // end of the list

        while (left < right) {
            // Swap the elements
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move the indices towards the center
            left++;
            right--;
        }
    }
    @Override
    public String toString() {
        return list.toString();
    }

}



