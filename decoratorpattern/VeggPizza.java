package decoratorpattern;

import decoratorpattern.AbscractPizza;

public class VeggPizza extends AbscractPizza {
    @Override
    public int cost() {
        return 100;
    }
}
