package task;

public class Task6 {

    public static void main(String[] args) {
        int[][] array = {{3, 4, 1, 6, 5},
                {0, 2, 3, 5, 7},
                {0, 0, 6, 3, 7},
                {0, 0, 0, 7, 8},
                {0, 0, 0, 0, 9}};
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < i) {
                    if (array[i][j] != 0) {
                        result = false;
                    }
                }
            }
        }
        if (result) {
            System.out.println("Является нижней треугольной матрицей");
        } else {
            System.out.println("Не является треугольной");

        }
    }
}
