import com.java.DataType;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 10; i++) {
            System.out.println(DataType.sum(i,2));
        }
    }
}