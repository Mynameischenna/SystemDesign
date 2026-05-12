package Concrete;

import Interface.Coffee;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Double getCost() {
        return 100.0;
    }
}
