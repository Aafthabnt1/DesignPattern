package decoratorpattern;

public class ExtraVeggi extends ToppingDecorator{
    AbscractPizza abscractPizza;

    public ExtraVeggi(AbscractPizza abscractPizza) {
        this.abscractPizza = abscractPizza;
    }

    @Override
    public int cost() {
        return this.abscractPizza.cost()+100;
    }
}
