package States;

import Interface.VendingMachineState;
import VendingMachine.VendingMachine;

public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Coin inserted: " + amount);
        vendingMachine.addBalance(amount);
        if (vendingMachine.getBalance() >= vendingMachine.getItemPrice()) {
            vendingMachine.setState(new DispensingState());
        }
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("The machine is now out of order.");
        vendingMachine.setState(new OutOfOrderState());
    }
}