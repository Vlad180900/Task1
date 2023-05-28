package home1;

public enum EnumMonth {

    JANUARY(1, " Январь"),
    FEBRUARY(2, "Февраль"),
    MARCH(3, "Март"),
    APRIL(4, "Апрель"),
    MAY(5, " Май"),
    JUNE(6, "Июнь"),
    JULY(7, "Июль"),
    AUGUST(8, "Август"),
    SEPTEMBER(9, "Сентябрь"),
    OCTOBER(10, "Октябрь"),
    NOVEMBER(11, "Ноябрь"),
    DECEMBER(12, "Декабрь");

    private int number;
    private String month;

    EnumMonth(int number, String month) {
        this.number = number;
        this.month = month;
    }

    public int getNumber() {
        return number;
    }


    public String getMonth() {
        return month;
    }


    public static String valueOf(int number) {
        for (EnumMonth month : values()) {
            if (month.getNumber() == number) {
                return month.getMonth();
            }
        }
        return null;
    }

    public static int valueOfMonth(String monthName) {
        for (EnumMonth month : values()) {
            if (month.getMonth().equalsIgnoreCase(monthName)) {
                return month.getNumber();
            }
        }
        return 0;
    }

}
