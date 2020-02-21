package spi;

/**
 * @author chenyh
 * @date 2020-02-21
 */
public class RedDemoService implements DemoService {

    @Override
    public void print() {
        System.out.println("red");
    }
}
