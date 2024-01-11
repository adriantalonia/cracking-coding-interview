package _005_java_courses._001_udemy._001_data_structures_and_algorithms_masterclass._02_big_o_notation;

public class Logarithm {
    static int binarySearch(int arr[], int n, int k) {
        int init = 0;
        int last = n-1;

        return search(arr, k, init, last);
    }

    static int search(int[] arr, int x, int init, int last) {
        if(init > last) {
            return -1;
        }else {
            int mid = (init+last)/2;
            if(x == arr[mid]) return mid;
            else if(x > arr[mid]) return search(arr, x, mid+1,last);
            else return search(arr,x,init, mid-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;
        System.out.println(binarySearch(arr, arr.length, target));
    }
}
