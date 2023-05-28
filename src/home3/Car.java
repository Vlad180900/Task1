package home3;

public class Car {
    private CarBrand carBrand;
    private String carColor;

    public Car(CarBrand carBrand, String carColor) {
        this.carBrand = carBrand;
        this.carColor = carColor;
    }

    public String getCarColor() {
        return carColor;
    }

    public void replaceColor(String color) {
        if (carBrand.equals(CarBrand.AUDI)) {
            if ("Синий Красный Зеленый".contains(color)) {
                this.carColor = color;
            }

        } else if (carBrand.equals(CarBrand.BMW)) {
            if ("Оранжевый Черный Фиолетовый".contains(color)) {
                this.carColor = color;
            }
        } else if (carBrand.equals(CarBrand.KIA)) {
            if ("Желтый Серый Белый".contains(color)) {
                this.carColor = color;
            }
        }
    }
}
