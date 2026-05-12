package Concrete;

import Interface.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public Double getCost() {
        return 110.0;
    }
}
