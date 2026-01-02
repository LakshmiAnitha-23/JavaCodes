package org.example.engine;

public class PetrolEngine implements Engine
{
    private String engineName;

    public PetrolEngine() {}

    public void setEngineName(String engineName)
    {
        this.engineName = engineName;
    }

    @Override
    public String type()
    {
        return "Petrol Engine: " + engineName;
    }
}
