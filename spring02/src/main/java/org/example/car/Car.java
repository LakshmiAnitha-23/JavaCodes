package org.example.car;

import org.example.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car
{
    @Autowired
    private Engine engine;

    public void start()
    {
        System.out.println("car started with " + engine.type());
    }
}
