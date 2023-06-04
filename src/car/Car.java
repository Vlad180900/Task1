package car;

import java.util.Arrays;
import java.util.Date;

public class Car {
    private Color color;
    private final Model model;
    private final Date yearOfIssue;
    private int wheelSize;
    private double engineCapacity;
    private OptionList[] optionLists;

    public Car(Color color, Model model, Date yearOfIssue, int wheelSize, double engineCapacity, OptionList[] optionLists) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;
        this.optionLists = optionLists;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Model getModel() {
        return model;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void addOption(OptionList option) {
        OptionList[] optionLists1 = new OptionList[optionLists.length + 1];
        for (int i = 0; i < optionLists.length; i++) {
            optionLists1[i] = optionLists[i];
        }
        optionLists1[optionLists1.length - 1] = option;
        optionLists = optionLists1;
    }

    public void removeOption(OptionList option) {
        OptionList[] optionLists1 = new OptionList[optionLists.length - 1];
        int b = 0;
        for (OptionList optionList : optionLists) {
            if (!optionList.equals(option)) {
                optionLists1[b] = optionList;
                b++;
            }
        }
        optionLists = optionLists1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", yearOfIssue=" + yearOfIssue +
                ", wheelSize=" + wheelSize +
                ", engineCapacity=" + engineCapacity +
                ", optionLists=" + Arrays.toString(optionLists) +
                '}';
    }
}