package stateDesignpatternvendingmachine.impl;

import stateDesignpatternvendingmachine.Coin;
import stateDesignpatternvendingmachine.Item;
import stateDesignpatternvendingmachine.State;
import stateDesignpatternvendingmachine.VendingMachine;

import java.util.List;

public class IdealState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
    System.out.println("The button is pressed");
    vendingMachine.setVendingMachineState(new HasMoney());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("you can not select a product in ideal state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin in ideal state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("you can not select a product in ideal state");
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
