package org.example.config;

import org.example.service.ServiceA;
import org.example.service.ServiceB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig
{
    @Bean
    public ServiceA serviceA()
    {
        return new ServiceA("Injected via consructor(java config)");
    }

    @Bean
    public ServiceB serviceB()
    {
        ServiceB b = new ServiceB();
        b.setMessage("Injected via Setter (Java config");
        return b;
    }
}
