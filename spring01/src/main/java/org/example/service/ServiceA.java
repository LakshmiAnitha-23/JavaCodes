package org.example.service;

public class ServiceA 
{
    private String message;
    
    public ServiceA(String message)
    {
        this.message = message;
    }
    
    public void display()
    {
        System.out.println("Service: " + message);
    }
}
