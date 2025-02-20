import VendingMachine.VendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5, 16);

        vendingMachine.selectItem("500ml Softdrinks");
        vendingMachine.insertCoin(17);
        vendingMachine.dispenseItem();

        vendingMachine.setOutOfOrder();
        vendingMachine.dispenseItem();
        vendingMachine.insertCoin(65);
        vendingMachine.selectItem("1L Softdrinks");
    }
}