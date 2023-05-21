package task;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {{-3, -4, -1, -6, 5, 6, 9}, {5, 8, 10, -5, -7,}};
        int numberPositive = 0;
        int numberNegative = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= 0) {
                    numberPositive++;
                } else {
                    numberNegative++;
                }

            }

        }
        if (numberNegative > numberPositive) {
            System.out.println("Больше отрицательных");
        } else if (numberPositive > numberNegative) {
            System.out.println("Больше положительных");
        } else {
            System.out.println("Равно");

        }
    }
}