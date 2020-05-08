package org.example.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyh
 * @date 2020-03-17
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"classpath:provider.xml"});
        context.start();

        System.in.read();
    }
}
