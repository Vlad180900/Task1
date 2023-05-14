package home;

public class Home {
    public static void main(String[] args) {
        int a = 28530020;
        int weeks = a / 60 / 60 / 24 / 7;
        int day = a / 60 / 60 / 24 % 7;
        int hour = a / 60 / 60 / 24 % 7;
        int min = a / 60 / 60 / 24 / 60 % 7;
        int sec = a % 60;
        System.out.println(weeks + " недели " + day + " дней " + hour + " часов " + min + " мин " + sec + " секунд" );

    }
}
