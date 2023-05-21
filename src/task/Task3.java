package task;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int n = 50;
        long [] array = new long[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                array[i] = i;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
        long sum = 0;
        for (int i = 0; i <  array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);

    }
}
