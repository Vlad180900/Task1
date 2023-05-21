package task;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;
        int n = 4;
        for (int i = 0; i <  array.length; i++) {
            if (n != array[i]) {
                sum = sum + array[i];
            }
        }
            System.out.println(sum);
    }
}