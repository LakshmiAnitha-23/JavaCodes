package org.example.config;


import org.example.engine.DieselEngine;
import org.example.engine.Engine;
import org.example.engine.PetrolEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig
{
    @Bean
    public Engine dieselEngine()
    {
        return new DieselEngine("v8 turbo diesel");
    }

    @Bean
    public Engine PetrolEngine()
    {
        PetrolEngine engine = new PetrolEngine();
        engine.setEngineName("1.2L Petrol");
        return engine;
    }

    @Bean
    public Engine engine()
    {
        return PetrolEngine();
    }

}
