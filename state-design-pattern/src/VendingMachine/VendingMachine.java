package VendingMachine;

import Interface.VendingMachineState;
import States.*;

public class VendingMachine {
    private VendingMachineState currentState;
    private int balance;
    private int itemInventory;
    private int itemPrice ;

    public VendingMachine(int initialInventory, int itemPrice) {
        this.itemInventory = initialInventory;
        this.itemPrice = itemPrice;
        this.balance = 0;
        this.currentState = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void selectItem(String item) {
        currentState.selectItem(this, item);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    public boolean isItemAvailable(String item) {
        return itemInventory > 0;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void decreaseItemInventory() {
        if (itemInventory > 0) {
            itemInventory--;
            System.out.println("Remaining inventory: " + itemInventory);
        } else {
            System.out.println("Out of stock.");
        }
    }

    public void resetBalance() {
        this.balance = 0;
    }
}