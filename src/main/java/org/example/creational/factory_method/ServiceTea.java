package org.example.creational.factory_method;

public class ServiceTea implements IService {
    @Override
    public String prepare() {
        return "Preparing tea...";
    }

    @Override
    public String serve() {
        return "Serving tea...";
    }
}
