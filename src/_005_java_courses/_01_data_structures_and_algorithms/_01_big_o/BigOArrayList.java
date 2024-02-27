package _005_java_courses._01_data_structures_and_algorithms._01_big_o;

import java.util.ArrayList;

public class BigOArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(11); // index = 0
        myArray.add(3); // index = 1
        myArray.add(23); // index = 2
        myArray.add(7); // index = 3

        // add a new element at the end
        myArray.add(14); // index = 4
        // this operation is equals to O(1)
        System.out.println(myArray);

        // remove an element at the beginning
        myArray.remove(4); // this operation is 0(1)
        System.out.println(myArray);

        // but when you want to add something in a specific position
        myArray.add(1, 12);
        // this operation has to reindex all the next elements
        // so the result is 0(n) where n = rest or total elements

        // same scenario when remove a specific element
        myArray.remove(2);
        // here it has to reindex the rest of elements
        // so this is O(n)

    }
}
