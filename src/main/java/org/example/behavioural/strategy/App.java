package org.example.behavioural.strategy;

public class App {
    public String calculate(Strategy strategy) {
        return strategy.calculate();
    }
}
