package home2;

public class Box {
    private final int x;
    private final int y;
    private final int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getBoxType() {
        if (x == y && y == z) {
            return "куб";
        } else if (x != 0 && y != 0 && z == 0) {
            return "Конверт";
        } else {
            return "Обычная коробка";
        }
    }

}


