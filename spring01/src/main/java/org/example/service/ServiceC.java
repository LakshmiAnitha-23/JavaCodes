package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceC
{
    @Autowired
    private ServiceA serviceA;

    public void process()
    {
        System.out.println("ServiceC using ServiceA:");
        serviceA.display();
    }
}
