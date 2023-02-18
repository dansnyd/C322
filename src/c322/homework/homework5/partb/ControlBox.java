package c322.homework.homework5.partb;

public class ControlBox {
    public static final int SLIDER_MIN = 0;
    public static final int SLIDER_MAX = 100;

    private boolean poweredOn;
    private int sliderValue;

    public ControlBox () {
        poweredOn = false;
        sliderValue = 0;
    }
    public int getSliderValue() {
        return sliderValue;
    }

    public boolean hasPower () {
        return poweredOn;
    }

    public void powerOn() {
        poweredOn = true;
    }

    public void powerOff() {
        poweredOn = false;
    }

    public void sliderIncrease () {
        if (hasPower()) {
            if (getSliderValue() < SLIDER_MAX) {
                sliderValue++;
                System.out.println(sliderValue);
            }
        }
    }

    public void sliderDecrease () {
        if (hasPower()) {
            if (getSliderValue() > SLIDER_MIN) {
                sliderValue--;
                System.out.println(sliderValue);
            }
        }
    }
}
