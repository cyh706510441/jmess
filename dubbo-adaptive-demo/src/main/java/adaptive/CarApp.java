package adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Collections;

/**
 * @author chenyh
 * @date 2020-05-08
 */
public class CarApp {

    public static void main(String[] args) {
        CarMaker carMaker = new CarMaker(new AdaptiveWheelMaker());

        URL url = new URL("", "", 0, Collections.singletonMap("wheel.maker", "raceWheelMaker"));
        //URL url = new URL("", "", 0, Collections.singletonMap("wheel.maker", "homeWheelMaker"));
        Car raceCar = carMaker.makeCar(url);

        System.out.println(raceCar);


        WheelMaker wheelMaker = ExtensionLoader.getExtensionLoader(WheelMaker.class).getAdaptiveExtension();
        Wheel wheel = wheelMaker.makeWheel(url);

        System.out.println(wheel);
    }
}
