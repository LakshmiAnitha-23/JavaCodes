package org.example.service;

public class ServiceB 
{
    private String message;
    
    public ServiceB() {}
    
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    public void display()
    {
        System.out.println("ServiceB: " + message);
    }
}
