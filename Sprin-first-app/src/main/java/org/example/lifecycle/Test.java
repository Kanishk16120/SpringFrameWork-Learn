package org.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifeconfig.xml");
        Life l1=(Life) context.getBean("l1");
        System.out.println(l1);
        context.registerShutdownHook();
    }
}
