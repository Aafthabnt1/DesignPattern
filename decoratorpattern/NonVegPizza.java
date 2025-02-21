package decoratorpattern;

import decoratorpattern.AbscractPizza;

public class NonVegPizza extends AbscractPizza {

    @Override
    public int cost() {
        return 200;
    }
}
