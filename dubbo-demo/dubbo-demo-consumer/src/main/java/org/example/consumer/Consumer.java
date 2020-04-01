package org.example.consumer;

import org.example.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyh
 * @date 2020-03-17
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();

        // 获取远程服务代理
        DemoService demoService = (DemoService)context.getBean("demoService");
        // 执行远程方法
        String hello = demoService.sayHello("World");
        // 显示调用结果
        System.out.println(hello);
    }
}
