package org.example.creational.factory_method;

public class ServiceCoffee implements IService {
    @Override
    public String prepare() {
        return "Preparing coffee...";
    }

    @Override
    public String serve() {
        return "Serving coffee...";
    }
}
