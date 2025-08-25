package arrays.move_zeroes;


import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/description/
public class problem283 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZero(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 12, 0, 0]
    }

    static void moveZero(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }
        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }
    }
}
