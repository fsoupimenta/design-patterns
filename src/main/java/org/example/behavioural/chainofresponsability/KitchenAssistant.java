package org.example.behavioural.chainofresponsability;

public class KitchenAssistant extends Employee {

    public KitchenAssistant(Employee superior) {
        orderType = OrderType.DISH;
        setSuperior(superior);
    }

    @Override
    public String getOrder() {
        return "🍽️";
    }

}
