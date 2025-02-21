package stateDesignpatternvendingmachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception;
    public int getChange(int returnChangeMoney);
    public Item dispenseProduct(VendingMachine machine,int codeNumber);
    public List<Coin> refundFullMoney(VendingMachine vendingMachine);

}
