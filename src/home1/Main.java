package home1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month" +
                ": ");
        if (scanner.hasNextInt()) {
            System.out.println(EnumMonth.valueOf(scanner.nextInt()));
        } else {
            System.out.println(EnumMonth.valueOfMonth(scanner.next()));
        }
    }
}




