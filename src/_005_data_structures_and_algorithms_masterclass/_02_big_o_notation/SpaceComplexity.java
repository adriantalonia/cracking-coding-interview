package _005_java_courses._001_udemy._001_data_structures_and_algorithms_masterclass._02_big_o_notation;

public class SpaceComplexity {

    public static void main(String[] args) {
        // O(n)
        System.out.println(sumN(3));

        // O(1)
        System.out.println(pairSumSeq(3));
    }

    static int sumN(int n){
        if (n <= 0) {
            return 0;
        }
        return n + sumN(n-1);
    }

    static int pairSumSeq(int n){
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total = total + pairSum(i, i+1);
        }
        return total;
    }

    static int pairSum(int a, int b) {
        return a + b;
    }
}
