package org.self.designpattern.behavioural.state;

public interface VendingMachineState {
    void insertCoin();

    void selectItem();

    void dispenseItem();

    void ejectCoin();
}
