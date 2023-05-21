package task;

public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{3, 4, 1, 6, 5},
                {4, 2, 3, 5, 7,},
                {8, 3, 6, 3, 7},
                {7, 3, 8, 7, 8},
                {4, 5, 9, 2, 9}};
        int[][] array1 = {{3, 4, 1, 6, 5},
                {4, 1, 3, 5, 2},
                {5, 3, 4, 3, 7},
                {9, 3, 8, 7, 8},
                {4, 5, 5, 5, 9}};
        int sum = sumArray(array);
        int sum1 = sumArray(array1);

        System.out.println(sum - sum1);
    }

    private static int sumArray(int[][] number1){
        int sum = 0;
        for (int i = 0; i < number1.length; i++) {
            for (int j = 0; j < number1[i].length; j++) {
                sum = sum + number1[i][j];
            }
        }
        return sum;
    }
}