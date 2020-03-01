import org.apache.dubbo.common.extension.SPI;

/**
 * @author chenyh
 * @date 2020-03-01
 */
@SPI(value = "tom")
public interface Animal {

    String sayHello();
}
