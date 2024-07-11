package org.example.structural.bridge;

class Tea extends Beverage {
    public Tea(float price, Exportation exportation) {
        super(price, exportation);
    }

    @Override
    public float calculatePrice() {
        return price * exportation.fee();
    }
}
