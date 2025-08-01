package org.self.designpattern.behavioural.state;

public class ClientCode {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin(); // Insert coin
        vendingMachine.selectItem(); // Select item
        vendingMachine.dispenseItem(); // Dispense item
        vendingMachine.ejectCoin(); // Eject coin (should not do anything since item is dispensed)

    }
}
