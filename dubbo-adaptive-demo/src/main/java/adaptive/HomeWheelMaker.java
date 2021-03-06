package adaptive;

import org.apache.dubbo.common.URL;

/**
 * @author chenyh
 * @date 2020-05-08
 */
public class HomeWheelMaker implements WheelMaker {

    @Override
    public Wheel makeWheel(URL url) {
        return new Wheel("home.wheel");
    }
}
