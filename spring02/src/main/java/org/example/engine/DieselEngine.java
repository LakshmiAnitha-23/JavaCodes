package org.example.engine;

public class DieselEngine implements Engine{

    private String engineName;

    public DieselEngine(String engineName)
    {
        this.engineName = engineName;
    }

    @Override
    public String type() {
        return "Diesel Engine: " + engineName;
    }
}
