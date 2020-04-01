package org.example.provider;

import org.example.DemoService;

/**
 * @author chenyh
 * @date 2020-03-17
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
