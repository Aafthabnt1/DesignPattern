package stateDesignpatternvendingmachine.impl;

import stateDesignpatternvendingmachine.Coin;
import stateDesignpatternvendingmachine.Item;
import stateDesignpatternvendingmachine.State;
import stateDesignpatternvendingmachine.VendingMachine;

import java.util.List;

public class dispenserState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) {

    }

    @Override
    public int getChange(int returnChangeMoney) {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        return null;
    }
}
