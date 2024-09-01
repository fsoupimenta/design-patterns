package org.example.behavioural.chainofresponsability;

public class Waiter extends Employee {

    public Waiter(Employee superior) {
        orderType = OrderType.MENU;
        setSuperior(superior);
    }

    @Override
    public String getOrder() {
        return "📖";
    }

}
