package car;

import javax.swing.text.html.Option;

public class Service {
    private  Car car;

    public void replaceColor(Color color, Car car) {
        car.setColor(color);
    }
    public void aadOption(OptionList option, Car car) {
        car.addOption(option);
    }
    public void removeOption(OptionList option, Car car) {
        car.removeOption(option);
    }
    public  void replaceWheelSize(int size, Car car) {
        car.setWheelSize(size);
    }

}
