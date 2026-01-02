package org.example;

import org.example.config.AppConfig;
import org.example.service.ServiceA;
import org.example.service.ServiceB;
import org.example.service.ServiceC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ServiceA a = context.getBean(ServiceA.class);
        ServiceB b= context.getBean(ServiceB.class);
        ServiceC c = context.getBean(ServiceC.class);

        a.display();
        b.display();
        c.process();
    }
}
