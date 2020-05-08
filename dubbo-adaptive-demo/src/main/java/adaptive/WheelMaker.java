package adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author chenyh
 * @date 2020-05-08
 */
@SPI
public interface WheelMaker {
    /**
     * 制造轮子
     * @param url url
     * @return 轮子
     */
    @Adaptive(value = "wheel.maker")
    Wheel makeWheel(URL url);
}
