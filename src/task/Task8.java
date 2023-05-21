package task;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 30, 40};
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}