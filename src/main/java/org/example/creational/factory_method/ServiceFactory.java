package org.example.creational.factory_method;

import java.lang.reflect.InvocationTargetException;

public class ServiceFactory {
    public static IService getService(String service) {
        try {
            Class<?> clazz = Class.forName("org.example.creational.factory_method.Service" + service);
            Object object = clazz.getDeclaredConstructor().newInstance();
            if (!(object instanceof IService)) {
                throw new IllegalArgumentException("Invalid service");
            }
            return (IService) object;
        } catch (ClassNotFoundException | IllegalAccessException |
                 InstantiationException | NoSuchMethodException |
                 InvocationTargetException ex) {
            throw new IllegalArgumentException("Non-existent service");
        }
    }
}
