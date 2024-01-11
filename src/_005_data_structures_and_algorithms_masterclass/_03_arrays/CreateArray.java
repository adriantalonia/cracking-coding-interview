package _005_java_courses._001_udemy._001_data_structures_and_algorithms_masterclass._03_arrays;

public class CreateArray {

    public static void main(String[] args) {
        int[] intArray; // <--- declaration <---- 0(1)
        intArray = new int[3]; // <--- instantiation <---- 0(1)
        intArray[0] = 1; // <--- initialization <---- 0(1) |
        intArray[1] = 2; // <--- initialization <---- 0(1) | <---O(N)
        intArray[2] = 3; // <--- initialization <---- 0(1) |

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
