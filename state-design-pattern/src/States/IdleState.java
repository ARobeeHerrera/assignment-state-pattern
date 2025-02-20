package States;

import Interface.VendingMachineState;
import VendingMachine.VendingMachine;

public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        if (vendingMachine.isItemAvailable(item)) {
            System.out.println("Item selected: " + item);
            vendingMachine.setState(new ItemSelectedState());
        } else {
            System.out.println("Item is not available.");
        }
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert coins while idle. Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Cannot dispense items while idle.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("The machine is now out of order.");
        vendingMachine.setState(new OutOfOrderState());
    }
}