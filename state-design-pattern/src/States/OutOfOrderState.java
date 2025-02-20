package States;

import Interface.VendingMachineState;
import VendingMachine.VendingMachine;

public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Machine is out of order. Cannot select item.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Machine is out of order. Cannot insert coins.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Machine is out of order. Cannot dispense item.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Machine is already out of order.");
    }
}