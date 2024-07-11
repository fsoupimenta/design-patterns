package org.example.structural.bridge;

class Coffee extends Beverage {
    public Coffee(float price, Exportation exportation) {
        super(price, exportation);
    }

    @Override
    public float calculatePrice() {
        return price * exportation.fee();
    }
}
