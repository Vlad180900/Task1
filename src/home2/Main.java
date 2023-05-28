package home2;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(2, 2, 2);
        Box box2 = new Box(2, 2, 2);
        Box box3 = new Box(5, 5, 5);
        System.out.println(box.getBoxType());
        System.out.println(box2.getBoxType());
        System.out.println(box3.getBoxType());
    }
}
