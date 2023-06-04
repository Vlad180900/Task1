package car;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CarShowroom carShowroom = new CarShowroom();
        carShowroom.printCar();
        OptionList[] optionLists =
                {OptionList.CRUISE, OptionList.AIR_CONDITIONING, OptionList.MULTIMEDIA, OptionList.HEATED_STEERING_WHEEL};
        Car car = carShowroom.creatCar(Color.RED, Model.AUDI, 16, 5.0, optionLists);
        carShowroom.printCar();
        System.out.println(car.toString());

        carShowroom.replaceColor(Color.WHITE, car);
        carShowroom.replaceWheelSize(23,car);

        System.out.println(car.toString());

    }
}
