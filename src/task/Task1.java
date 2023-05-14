package task;

public class Task1 {
    public static void main(String[] args) {
        int e = 15;
        int f = 15;
        int a = 5;
        int b = 10;
        int c = 10;
        int d = 10;
        if (e >= b && e >= d && f >= a + c) {
            System.out.println("помещается на участок 1");
        } else {
            System.out.println("не помещается на участок 1");
        }

        if (e >= b + c && f >= a && f >= b) {
            System.out.println("помещается на участок 2");
        } else {
            System.out.println("не помещается на участок 2");
        }

        if (e >= b && e >= c && f >= a + d) {
            System.out.println("помещается на участок 3");
        } else {
            System.out.println("не помещается на участок 3");
        }

        if (e >= b + d && f >= a && f >= c) {
            System.out.println("помещается на участок 4");
        } else {
            System.out.println("не помещается на участок 4");
        }

        if (e >= a && e >= d && f >= b + c) {
            System.out.println("помещается на участок 5");
        } else {
            System.out.println("не помещается на участок 5");
        }

        if (e >= a && e >= c && f >= b + d) {
            System.out.println("помещается на участок 6");
        } else {
            System.out.println("не помещается на участок 6");
        }

        if (e >= a + d && f >= b && f >= c) {
            System.out.println("помещается на участок 7");
        } else {
            System.out.println("не помещается на участок 7");
        }

        if (e >= a + c && f >= b && f >= c) {
            System.out.println("помещается на участок 8");
        } else {
            System.out.println("не помещается на участок 8");
        }

    }
}
