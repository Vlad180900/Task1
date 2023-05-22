package task;

import java.util.Arrays;

    public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int newArray = array.length;
        for (int i = 0; i < array.length / 2; i++) {
         int temp = array[newArray - i - 1];
         array[newArray - i -1] = array[i];
         array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


