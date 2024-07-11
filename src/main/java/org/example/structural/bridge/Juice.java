package org.example.structural.bridge;

class Juice extends Beverage {
    public Juice(float price, Exportation exportation) {
        super(price, exportation);
    }

    @Override
    public float calculatePrice() {
        return price * exportation.fee();
    }
}
