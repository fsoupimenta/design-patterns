package org.example.behavioural.chainofresponsability;

public class Chef extends Employee {

    public Chef(Employee superior) {
        orderType = OrderType.MEAL;
        setSuperior(superior);
    }

    @Override
    public String getOrder() {
        return "🍲";
    }

}
