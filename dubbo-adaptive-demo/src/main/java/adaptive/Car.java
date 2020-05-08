package adaptive;

/**
 * @author chenyh
 * @date 2020-05-08
 */
public class Car {
    private final Wheel wheel;

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "adaptive.Car{" +
                "wheel=" + wheel +
                '}';
    }
}
