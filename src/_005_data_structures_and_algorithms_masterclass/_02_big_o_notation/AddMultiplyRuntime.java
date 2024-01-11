package _005_java_courses._001_udemy._001_data_structures_and_algorithms_masterclass._02_big_o_notation;

public class AddMultiplyRuntime {

    public static void main(String[] args) {
        int a = 10;
        int b = 8;

        // Add O(A + B)
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < b; j++) {
            System.out.println(j);
        }

        //Multiply O(A * B)
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i+" "+j);
            }
        }
    }
}
