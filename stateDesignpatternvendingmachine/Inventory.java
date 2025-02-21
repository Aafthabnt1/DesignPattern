package stateDesignpatternvendingmachine;

public class Inventory {
    ItemShelf[] inventory=null;

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public Inventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public Inventory(int i) {
        this.inventory=new ItemShelf[i];
    }
}
