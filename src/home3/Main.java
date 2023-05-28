package home3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(CarBrand.AUDI,"Синий");
        Car car1 = new Car(CarBrand.BMW,"Оранжевый");
        Car car2 = new Car(CarBrand.KIA, "Жултый");
        System.out.println(car.getCarColor());
        car.replaceColor("Черный");
        System.out.println(car.getCarColor());
        car.replaceColor("Красный");
        System.out.println(car.getCarColor());
    }
}
