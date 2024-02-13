package _005_java_courses._01_data_structures_and_algorithms._01_big_o;

public class BigO {

    public static void main(String[] args) {

        printItemsLinear(10);
        printItemsQuadratic(10);
        System.out.println("Binary search: " + binarySearch());
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

    // O(logn) - Logarithmic time
    private static int binarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 7;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Different terms for inputs


}
