package org.cfs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("---------BeansFactory-----------");
//        BeanFactory bn=new ClassPathXmlApplicationContext("Beans.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("--------Beans File Started--------------");

        System.out.println("-------Sending Request---------");

        System.out.println("-------First call---------");
        Car car1=context.getBean(Car.class);

        System.out.println("-------Second call---------");
        Car car2=context.getBean(Car.class);


        System.out.println("Same Object ?"+(car1==car2));

        System.out.println("-------First call---------");
        PetrolEngine p1=context.getBean(PetrolEngine.class);

        System.out.println("-------Second call---------");
        PetrolEngine p2=context.getBean(PetrolEngine.class);


        System.out.println("Same Object ?"+(p1==p2));
    }
}
