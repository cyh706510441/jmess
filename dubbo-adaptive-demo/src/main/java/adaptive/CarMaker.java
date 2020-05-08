package adaptive;

import org.apache.dubbo.common.URL;

/**
 * @author chenyh
 * @date 2020-05-08
 */
public class CarMaker {

    private final WheelMaker wheelMaker;

    public CarMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }

    public Car makeCar(URL url) {
        return new Car(wheelMaker.makeWheel(url));
    }
}
