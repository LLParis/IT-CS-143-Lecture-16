class Lecture16 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 16");

        // Self-Check Problems:
        // Section 16.3: A Complex List Operation

        // 26. What are the four cases examined in the addSorted method?
        // Empty list, Insertion at the beginning, Insertion in the middle,
        // and Insertion at the end.

        // 27. What is the “inchworm approach”?
        // What advantages does this approach have over other approaches for examining a
        // linked list?
        // The inchworm approach is am algorithm where two pointers traverse a list.
        // The first pointer moves at a faster rate while the second pointer follows at a slower rate.
        // Advantages of this approach are cycle detection: the first pointer moves two steps for the
        // second pointer's one step and they will eventually meet if there is a cycle.
        // Finding Nth element: for the middle, the first pointer will have reached the end by the time
        // the second pointer reaches the middle. This is more efficient that traversing twice to find
        // the number of elements and then the middle.

        // 28. Write methods called sum and average that return the sum of all values in
        // the list and the average value as a real number, respectively.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.sum() should return 63 and the call of list.average() should
        // return 10.5. If the list is empty, sum should return 0 and average should
        // return 0.0.

        // Section 16.4: An IntList Interface

        // 29. What are some advantages of creating an IntList interface and having both
        // types of lists implement it?

        // 30. Write a method called firstLast that can accept either type of integer
        // list as a parameter and that moves the first element of the list to the end.
        // For example, if a variable called list contains the values [12, 45, 78, 20,
        // 36], the call of firstLast(list); will change the list to store [45, 78, 20,
        // 36, 12].

        // Section 16.5: LinkedList<E>

        // 31. What are some changes that need to be made to the linked list class to
        // convert it from storing integers to storing objects of type E?

        // 32. Why is an iterator especially useful with linked lists?

        // 33. What state does the linked list iterator store? How does the iterator
        // know if there are more elements left to examine?

        // Exercises:

        // 18. Write a method called doubleList that doubles the size of a list by
        // appending a copy of the original sequence to the end of the list.

        // For example, if a variable list stores the values [1, 3, 2, 7] and we make
        // the call of list.doubleList(); then after the call it should store [1, 3, 2,
        // 7, 1, 3, 2, 7]. Notice that the list has been doubled in size by having the
        // original sequence appear twice in a row. You may not make assumptions about
        // how many elements are in the list. You may not call any methods of the class
        // to solve this problem. If the original list contains N nodes, then you should
        // construct exactly N nodes to be added. You may not use any auxiliary data
        // structures such as arrays or ArrayLists to solve this problem. Your method
        // should run in O(N) time where N is the number of nodes in the list.

        // 19. Write a method called rotate that moves the value at the front of a list
        // of integers to the end of the list.

        // For example, if a variable called list stores the values [8, 23, 19, 7, 45,
        // 98, 102, 4], then the call of list.rotate(); should move the value 8 from the
        // front of the list to the back of the list, changing the list to store [23,
        // 19, 7, 45, 98, 102, 4, 8]. If the method is called for a list of 0 elements
        // or 1 element, it should have no effect on the list. You may neither construct
        // any new nodes to solve this problem nor change any of the data values stored
        // in the nodes. You must solve the problem by rearranging the links of the
        // list.

        // 21.  Write a method called surroundWith that takes an integer x and an
        // integer y as parameters and surrounds all nodes in the list containing the
        // value x with new nodes containing the value y.

        // In particular, each node that contains the value x as data should have a new
        // node just before it and just after it that each contain the value y. If no
        // nodes in the list contain the value x, then the list should not be modified.
        // For example, suppose that the variables list1, list2, and list3 store the
        // following sequences of values:

        // [0, 1, 2, 1]    // stored in list1
        // [0, 1, 0]       // stored in list2
        // [0, 1, 2]       // stored in list3

        // and we make the following calls:

        // list1.surroundWith(1, 4);   // surround 1s with 4s
        // list2.surroundWith(1, 1);   // surround 1s with 1s
        // list3.surroundWith(3, 4);   // surround 3s with 4s

        // then the variables will now store these sequences:

        // [0, 4, 1, 4, 2, 4, 1, 4]    // stored in list1
        // [0, 1, 1, 1, 0]             // stored in list2
        // [0, 1, 2]                   // stored in list3

        // 22. Write a method called reverse that reverses the order of the elements in
        // the list.
        // (This is very challenging!) For example, if the variable list initially
        // stores the values [1, 8, 19, 4, 17], the call of list.reverse(); should
        // change the list to store [17, 4, 19, 8, 1].
    }
}
