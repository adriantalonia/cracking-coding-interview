package _005_java_courses._001_udemy._001_data_structures_and_algorithms_masterclass._02_big_o_notation;

public class Squared {

    public static void main(String[] args) {
        int n = 10;
        // O(n^2)
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println(i+" "+j);
            }
        }

        // O(n)
        for (int k = 0; k <n; k++) {
            System.out.println(k);
        }

        // Drop Non Dominant terms
        // O(n^2 + n) = O(n^2)
    }
}
