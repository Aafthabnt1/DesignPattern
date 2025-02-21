package stateDesignpatternvendingmachine;

public enum Coin {
    PENNY(1),
    NICKELL(5),
    DINE(10);
    public int value;

    Coin(int value) {
        this.value=value;
    }


}
