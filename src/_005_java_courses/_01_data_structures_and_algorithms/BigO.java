package _005_java_courses._01_data_structures_and_algorithms;

public class BigO {

    public static void main(String[] args) {

        printItemsLinear(10);
        printItemsQuadratic(10);
    }

    public static void printItemsLinear(int i) {

        // Big O(n) = Linear Time increases with the size of the input
        for (int j = 0; j < i; j++) {
            System.out.println(j);
        }
    }

    public static void printItemsQuadratic(int n) {

        // Big O(n^2) = Quadratic time grows with the size of the input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static int addItems(int n) {
        return n + n + n; // O(1) most efficient
    }
}
