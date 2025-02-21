package stateDesignpatternvendingmachine.impl;

import stateDesignpatternvendingmachine.Coin;
import stateDesignpatternvendingmachine.Item;
import stateDesignpatternvendingmachine.State;
import stateDesignpatternvendingmachine.VendingMachine;

import java.util.List;

public class HasMoney implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert a coin state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);

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
