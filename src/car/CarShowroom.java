package car;

import oop.Sex;

public class CarShowroom {
    private final CarFactory carFactory;
    private Service service;

    public CarShowroom() {
        Color[] colors = {Color.BLUE, Color.GREEN, Color.WHITE, Color.WHITE};
        Model[] models = {Model.BMW, Model.AUDI, Model.KIA, Model.LADA};
        int[] sizes = {15, 16, 17, 18, 20, 21};
        double[] engineCapacity = {1.6, 2.0, 2.2, 3.5, 5.0};
        carFactory = new CarFactory(colors, models, sizes, engineCapacity);
        service = new Service();

    }

    public Car creatCar(Color color, Model model, int wheelSize, double engineCapacity, OptionList[] optionLists) {
        return carFactory.creatCar(color, model, wheelSize, engineCapacity, optionLists);
    }
    public void replaceColor(Color color, Car car) {
        service.replaceColor(color, car);
    }
    public void aadOption(OptionList option, Car car) {
        service.aadOption(option, car);
    }
    public void removeOption(OptionList option, Car car) {
        service.removeOption(option, car);
    }
    public  void replaceWheelSize(int size, Car car) {
        service.replaceWheelSize(size, car);
    }
    public void printInfo() {
        carFactory.printInfo();
    }
    public void printCar() {
        carFactory.printCars();
    }



}
