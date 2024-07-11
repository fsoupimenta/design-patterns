package org.example.structural.bridge;

abstract class Beverage {
    protected float price;
    protected Exportation exportation;

    public Beverage(float price, Exportation exportation) {
        this.price = price;
        this.exportation = exportation;
    }

    public abstract float calculatePrice();
}
