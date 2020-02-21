package spi;

import java.util.ServiceLoader;

/**
 * @author chenyh
 * @date 2020-02-21
 */
public class Demo {

    public static void main(String[] args) {
        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        for (DemoService demoService : serviceLoader) {
            demoService.print();
        }
    }
}
