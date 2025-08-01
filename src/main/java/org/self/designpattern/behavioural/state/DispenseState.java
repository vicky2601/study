package org.self.designpattern.behavioural.state;

public class DispenseState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing item...");
    }

    @Override
    public void selectItem() {
        System.out.println("Please wait, dispensing item...");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed successfully!");
        vendingMachine.setState(new NoCoinState(vendingMachine));
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject coin, item is being dispensed.");
    }
}
