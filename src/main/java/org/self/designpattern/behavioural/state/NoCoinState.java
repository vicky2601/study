package org.self.designpattern.behavioural.state;

public class NoCoinState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(new SelectItemState(vendingMachine));
    }

    @Override
    public void selectItem() {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("No coin inserted. Cannot dispense item.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }
}
