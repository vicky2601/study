package org.self.designpattern.behavioural.state;

public class SelectItemState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public SelectItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted. Please select an item.");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected. Dispensing item...");
        vendingMachine.setState(new DispenseState(vendingMachine));
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected.");
        vendingMachine.setState(new NoCoinState(vendingMachine));
    }
}
