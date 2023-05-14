package home;

public class Home3 {
    public static void main(String[] args) {
        variant2();
        System.out.println();
        for (int i = 1; i < 16; i++) {
            System.out.print(" *");
            if ( i % 5 == 0 ) {
                System.out.println();
            }

        }
    }
    private static void variant2(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
