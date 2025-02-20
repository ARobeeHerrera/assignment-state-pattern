package States;

import Interface.VendingMachineState;
import VendingMachine.VendingMachine;

public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item is being dispensed. Cannot select another item.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Item is being dispensed. Cannot insert coins.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing item...");
        vendingMachine.decreaseItemInventory();
        vendingMachine.resetBalance();
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Cannot set out of order while dispensing.");
    }
}