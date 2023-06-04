package car;

import java.util.Arrays;
import java.util.Date;

public class CarFactory {
    private final Color[] color;
    private final Model[] models;
    private final int[] size;
    private final double[] engineCapacity;
    private Car[] carWarehouse;

    public CarFactory(Color[] color, Model[] models, int[] size, double[] engineCapacity) {
        this.color = color;
        this.models = models;
        this.size = size;
        this.engineCapacity = engineCapacity;
        this.carWarehouse = new Car[2];
        OptionList[] optionLists = {OptionList.CRUISE, OptionList.AIR_CONDITIONING, OptionList.MULTIMEDIA, OptionList.HEATED_STEERING_WHEEL};
        Car car = new Car(Color.BLUE, Model.AUDI, new Date(), 21, 5.0, optionLists);
        carWarehouse[0] = car;

        OptionList[] optionLists1 = {OptionList.AIR_CONDITIONING, OptionList.MULTIMEDIA,};
        Car car1 = new Car(Color.GREEN, Model.KIA, new Date(), 16, 2.0, optionLists1);
        carWarehouse[1] = car1;
    }

    public void printInfo() {
        System.out.println("Доступные цвета:" + Arrays.toString(color));
        System.out.println("Доступные размеры колес:" + Arrays.toString(size));
        System.out.println("Доступные объумы двигателя:" + Arrays.toString(engineCapacity));
        System.out.println("Доступные модели:" + Arrays.toString(models));
    }

    public Car creatCar(Color color, Model model, int wheelSize, double engineCapacity, OptionList[] optionLists) {
        Car car = null;
        for (int i = 0; i < carWarehouse.length; i++) {
            if (carWarehouse[i].getColor().equals(color) && carWarehouse[i].getModel().equals(model)
                    && carWarehouse[i].getEngineCapacity() == engineCapacity && carWarehouse[i].getWheelSize() == wheelSize) {
                car = carWarehouse[i];
            }
        }
        if (car != null) {
            Car[] cars = new Car[carWarehouse.length - 1];
            int a = 0;
            for (Car value : carWarehouse) {
                if (!value.equals(car)) {
                    cars[a] = value;
                    a++;
                }
            }
            carWarehouse = cars;
            return car;
        }
        return new Car(color,model,new Date(), wheelSize,engineCapacity,optionLists);
    }
    public void printCars() {
        System.out.println(Arrays.toString(carWarehouse));

    }
}