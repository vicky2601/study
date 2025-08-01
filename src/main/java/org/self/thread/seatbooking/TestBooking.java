package org.self.thread.seatbooking;

import org.self.thread.seatbooking.BookingSeat;
import org.self.thread.seatbooking.Seat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestBooking {

    public static void main(String[] args) {
        BookingSeat bookingSeat = new BookingSeat();

        // Create some seats
        Seat seat1 = new Seat(1, 1);
        Seat seat2 = new Seat(1, 2);
        Seat seat3 = new Seat(2, 1);

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        // Simulate booking seats in parallel
        for (int i = 0; i < 2; i++) {
            executorService.submit(() -> {
                // Each thread tries to book a seat
                System.out.println("Booking seat 1 " + seat1.getKey() + ": " + bookingSeat.bookSeat(seat1));
                System.out.println("Booking seat 2 " + seat2.getKey() + ": " + bookingSeat.bookSeat(seat2));
                System.out.println("Booking seat 3 " + seat3.getKey() + ": " + bookingSeat.bookSeat(seat3));
            });
        }
        executorService.shutdown();
    }
}
