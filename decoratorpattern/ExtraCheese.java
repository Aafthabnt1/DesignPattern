package decoratorpattern;

import decoratorpattern.AbscractPizza;

public class ExtraCheese extends ToppingDecorator {
    AbscractPizza abscractPizza;

    public ExtraCheese(AbscractPizza abscractPizza) {
        this.abscractPizza = abscractPizza;
    }

    @Override
    public int cost() {
        return this.abscractPizza.cost()+10;
    }
}
