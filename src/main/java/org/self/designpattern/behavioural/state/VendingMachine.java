package org.self.designpattern.behavioural.state;

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        this.currentState = new NoCoinState(this);
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }
}
